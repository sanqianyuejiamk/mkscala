package mengka.thread_04.method_02

import scala.actors.Actor
import scala.actors.Actor._

/**
 *  多线程计算例子：
 *           隐式启动
 *
 * User: mengka
 * Date: 15-2-26-下午6:34
 */
object send_01 {

  def main(args: Array[String]): Unit = {
    /**
     * step01:
     *    启动3个线程处理不同的数据
     */
    mengkaService !(self, 20)
    mengkaService !(self, 12)
    mengkaService !(self, 4)

    /**
     * step02:
     *    打印线程返回的结果，顺序随机
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

  def invokeResult(number: Any, result: Any): Unit = {
    println("-----------, 1*..*" + number + "=" + result)
  }

}
