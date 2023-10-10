package mengka.actor_03

import scala.actors.Actor
import scala.actors.Actor._

/**
 *  actor发送消息【方法二】:
 *       使用actor()方法；
 *
 * Created by mengka
 */
object Taa {

  def main(args: Array[String]): Unit = {


    /**
     * step01:
     * 发送message
     */
    mengkaServive !(self, "baicia AAA..")
    mengkaServive !(self, "baicia BBB..")
    mengkaServive !(self, "baicia CCC..")
    mengkaServive !(self, "baicia DDD..")

    /**
     * step02:
     * 接收message
     */
    for (i <- 1 to 4) {
      receive {
        case result => invokeMessage(result)
      }
    }

    mengkaServive ! ("quit")
    mengkaServive !(self, "baicia EEE..")
  }

  /**
   * 对消息的处理
   *
   * @param result
   */
  def invokeMessage(result: Any): Unit = {
    println("-----------, get result = " + result)
  }

  /**
   *  使用actor()方法,发送消息
   *
   */
  val mengkaServive = actor {

    while (true) {
      receive {
        case (caller: Actor, message: String) =>
          caller ! (message)
        case "quit" =>

          /**
           * 调用exit()方法，停止actor的运行；
           */
          println("exiting mengkaService..")
          exit
      }
    }
  }


}


