package mengka.thread_reactWithin_02

import scala.actors._
import Actor._

/**
 * reactWithin使用：
 * 1.reactWithin(100)，在100ms内，如果没有收到消息，就会超时；
 * 2.使用react()，在等待接收消息时，不持有任何线程；
 * 3.reactWithin(100)，利用来自线程池的线程；
 *
 * User: mengka
 * Date: 15-3-7-下午9:10
 */
object react_02 {

  val caller = self

  def main(args: Array[String]): Unit = {
    mengkaService ! 20
    mengkaService ! 11
    mengkaService ! 30
    mengkaService ! 22
    mengkaService ! 12
    mengkaService ! 32

    receiveWithin(500) {
      case result => invokeResult(result)
    }
  }

  /**
   *  多线程求和
   */
  val mengkaService = actor {
    mengkaSum(0)
  }

  def mengkaSum(total: Int): Unit = {
    reactWithin(100) {
      case num: Int =>
         println("num = "+num)
         mengkaSum(total + num)
      case TIMEOUT => caller ! total//超时的时候，发送total
    }

    println("该行不会被执行，因为react()内部是通过抛出异常的来处理的。。。")
  }

  def invokeResult(result: Any): Unit = {
    println("-----------, result = " + result)
  }
}
