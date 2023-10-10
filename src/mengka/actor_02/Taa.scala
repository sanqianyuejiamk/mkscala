package mengka.actor_02

import scala.actors.Actor._

/**
 * Created by mengka
 */
object Taa {

  def main(args: Array[String]): Unit = {

    /**
     * step01:
     *    actor��������ʽ��
     */
    val mengkaService = new MengkaServer()
    mengkaService.start()

    /**
     * step02:
     *    ����message
     */
    mengkaService !(self, "baicia AAA..")
    mengkaService !(self, "baicia BBB..")
    mengkaService !(self, "baicia CCC..")
    mengkaService !(self, "baicia DDD..")

    /**
     * step03:
     *    ����message
     */
    for (i <- 1 to 4) {
      receive {
        case result => invokeMessage(result)
      }
    }

    mengkaService!("quit")
    mengkaService !(self, "baicia EEE..")
  }

  /**
   *  ����Ϣ�Ĵ���
   *
   * @param result
   */
  def invokeMessage(result: Any): Unit = {
    println("-----------, get result = " + result)
  }
}
