package mengka.thread_reactWithin_03

import scala.actors.Actor._
import scala.actors.TIMEOUT

/**
 * User: mengka
 * Date: 15-3-7-下午9:38
 */
object reactWithin_03 {

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
   * 多线程求和
   */
  val mengkaService = actor {
    var continue = true
    var total = 0

    loopWhile(continue) {
      reactWithin(100) {
        case num: Int =>
          println("num = " + num)
          total = total + num
        case TIMEOUT =>
          continue = false
          caller ! total //超时的时候，发送total
      }
    }
  }


  def invokeResult(result: Any): Unit = {
    println("-----------, result = " + result)
  }
}
