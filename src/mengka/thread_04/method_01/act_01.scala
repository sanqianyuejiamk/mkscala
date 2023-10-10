package mengka.thread_04.method_01

import scala.actors.Actor._

/**
 *   ��ʾ����
 *
 * User: mengka
 * Date: 15-3-7-����8:36
 */
object act_01 {

  def main(args: Array[String]): Unit = {
    val mengkaService = new MengkaService()
    mengkaService.start()

    /**
     * step01:
     * ����3���̴߳���ͬ������
     */
    mengkaService ! (20)
    mengkaService ! (12)
    mengkaService ! (4)

    /**
     * step02:
     * ��ӡ�̷߳��صĽ����˳�����
     */
    for (i <- 1 to 3) {
      receive {
        case (number, result) => invokeResult(number, result)
      }
    }
  }

  def invokeResult(number: Any, result: Any): Unit = {
    println("-----------, 1*..*" + number + "=" + result)
  }

}
