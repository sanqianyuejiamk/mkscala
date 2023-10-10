package mengka.thread_receiveWithin_01

import scala.actors.{TIMEOUT, Actor}
import scala.actors.Actor._

/**
  * 区别receiveWithin和receive：
  *   ①receive()是阻塞的，收不到消息会一直等待；
  *   ②receiveWithin(5000)，具有等待超时时间；
  *
  * User: mengka
  * Date: 15-2-26-下午6:34
  */
object receiveWithin_01 {

   def main(args: Array[String]): Unit = {
     /**
      * step01:
      *    启动3个线程处理不同的数据
      */
     mengkaService !(self, 20)
     mengkaService !(self, 12)//超过5s最长时间
     mengkaService !(self, 4)

     /**
      * step02:
      *    打印线程返回的结果，顺序随机
      */
     for (i <- 1 to 3) {
       receiveWithin(5000) {
         case (number, result) => invokeResult(number, result)
       }
     }
   }

   val mengkaService = actor {
     while (true) {
       receiveWithin(5000) {
         case (caller: Actor, number: Int) =>
           //每个任务启动一个actor执行
           actor {
             caller !(number, mengka(number))
           }

         /**
          *  任务超时
          */
         case TIMEOUT => println("-----------, mengkaService timeout!")
       }
     }
   }

   /**
    * 每个线程的处理逻辑
    *
    * @param number
    * @return
    */
   def mengka(number: Int) = {
     var result = 1
     for (i <- 1 to number) {
       result = result * i
     }
     if(number==12){
       Thread.sleep(6000)
     }
     result
   }

   def invokeResult(number: Any, result: Any): Unit = {
     println("-----------, 1*..*" + number + "=" + result)
   }

 }
