package mengka.actor_01

import scala.actors._
import Actor._

/**
 * �Լ�����actor��ʱ����
 *
 * User: mengka.hyy
 * Date: 14-7-12-����11:39
 */
object Taa {

  def main(args: Array[String]): Unit = {

    /**
     * ��һ��
     * ���ʹ�����Ϣ
     */
    val mengkaService = new MengkaService("baicai", "qingcai", "xigua")
    mengkaService !(self, "baicai", "baicai AAA..")
    mengkaService !(self, "qingcai", "qingcai BBB..")
    mengkaService.start()
    mengkaService !(self, "qingcai11", "qingcai BBB..")
    mengkaService !(self, "baicai11", "baicai BBB..")

    /**
     * ѭ������mengkaService����4����Ϣ֮�󷵻صĽ��
     *
     */
    for (i <- 1 to 4) {
      receive {
        case result => println("get result = " + result)
      }
    }

    /**
     * �˳�
     * ��ֹactor��ִ�У����ٽ�����Ϣ
     */
    mengkaService ! "quit"

  }

}
