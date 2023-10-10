package mengka.thread_04.method_01

import scala.actors.Actor
import scala.actors.Actor._

/**
 * �̳�Actor�࣬ʹ��act()����������Ϣ
 *
 * User: mengka
 * Date: 15-3-7-����8:33
 */
class MengkaService extends Actor {

  val caller = self

  override def act(): Unit = {
    while (true) {
      receive {
        case (number: Int) =>
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

}
