package mengka.thread_04.method_01

import scala.actors.Actor._

/**
 *   显示启动
 *
 * User: mengka
 * Date: 15-3-7-下午8:36
 */
object act_01 {

  def main(args: Array[String]): Unit = {
    val mengkaService = new MengkaService()
    mengkaService.start()

    /**
     * step01:
     * 启动3个线程处理不同的数据
     */
    mengkaService ! (20)
    mengkaService ! (12)
    mengkaService ! (4)

    /**
     * step02:
     * 打印线程返回的结果，顺序随机
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
