package mengka.thread_04.method_01

import scala.actors.Actor
import scala.actors.Actor._

/**
 * 继承Actor类，使用act()方法发送消息
 *
 * User: mengka
 * Date: 15-3-7-下午8:33
 */
class MengkaService extends Actor {

  val caller = self

  override def act(): Unit = {
    while (true) {
      receive {
        case (number: Int) =>
          //每个任务启动一个actor执行
          actor {
            caller !(number, mengka(number))
          }
      }
    }
  }

  /**
   * 每个线程的处理逻辑
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
