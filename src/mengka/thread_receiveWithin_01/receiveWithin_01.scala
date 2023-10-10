package mengka.thread_receiveWithin_01

import scala.actors.{TIMEOUT, Actor}
import scala.actors.Actor._

/**
  * ����receiveWithin��receive��
  *   ��receive()�������ģ��ղ�����Ϣ��һֱ�ȴ���
  *   ��receiveWithin(5000)�����еȴ���ʱʱ�䣻
  *
  * User: mengka
  * Date: 15-2-26-����6:34
  */
object receiveWithin_01 {

   def main(args: Array[String]): Unit = {
     /**
      * step01:
      *    ����3���̴߳���ͬ������
      */
     mengkaService !(self, 20)
     mengkaService !(self, 12)//����5s�ʱ��
     mengkaService !(self, 4)

     /**
      * step02:
      *    ��ӡ�̷߳��صĽ����˳�����
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
           //ÿ����������һ��actorִ��
           actor {
             caller !(number, mengka(number))
           }

         /**
          *  ����ʱ
          */
         case TIMEOUT => println("-----------, mengkaService timeout!")
       }
     }
   }

   /**
    * ÿ���̵߳Ĵ����߼�
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
