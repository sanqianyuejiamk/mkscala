package mengka.actor_03

import scala.actors.Actor
import scala.actors.Actor._

/**
 *  actor������Ϣ����������:
 *       ʹ��actor()������
 *
 * Created by mengka
 */
object Taa {

  def main(args: Array[String]): Unit = {


    /**
     * step01:
     * ����message
     */
    mengkaServive !(self, "baicia AAA..")
    mengkaServive !(self, "baicia BBB..")
    mengkaServive !(self, "baicia CCC..")
    mengkaServive !(self, "baicia DDD..")

    /**
     * step02:
     * ����message
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
   * ����Ϣ�Ĵ���
   *
   * @param result
   */
  def invokeMessage(result: Any): Unit = {
    println("-----------, get result = " + result)
  }

  /**
   *  ʹ��actor()����,������Ϣ
   *
   */
  val mengkaServive = actor {

    while (true) {
      receive {
        case (caller: Actor, message: String) =>
          caller ! (message)
        case "quit" =>

          /**
           * ����exit()������ֹͣactor�����У�
           */
          println("exiting mengkaService..")
          exit
      }
    }
  }


}


