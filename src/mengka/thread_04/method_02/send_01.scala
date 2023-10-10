package mengka.thread_04.method_02

import scala.actors.Actor
import scala.actors.Actor._

/**
 *  ���̼߳������ӣ�
 *           ��ʽ����
 *
 * User: mengka
 * Date: 15-2-26-����6:34
 */
object send_01 {

  def main(args: Array[String]): Unit = {
    /**
     * step01:
     *    ����3���̴߳���ͬ������
     */
    mengkaService !(self, 20)
    mengkaService !(self, 12)
    mengkaService !(self, 4)

    /**
     * step02:
     *    ��ӡ�̷߳��صĽ����˳�����
     */
    for (i <- 1 to 3) {
      receive {
        case (number, result) => invokeResult(number, result)
      }
    }
  }

  val mengkaService = actor {
    while (true) {
      receive {
        case (caller: Actor, number: Int) =>
          //ÿ����������һ��actorִ��
          actor {
            caller !(number, mengka(number))
          }
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
    result
  }

  def invokeResult(number: Any, result: Any): Unit = {
    println("-----------, 1*..*" + number + "=" + result)
  }

}
