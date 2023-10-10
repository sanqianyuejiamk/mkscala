package mengka.actor_01

import scala.actors._
import Actor._

/**
 * 自己控制actor何时启动
 *
 * User: mengka.hyy
 * Date: 14-7-12-上午11:39
 */
object Taa {

  def main(args: Array[String]): Unit = {

    /**
     * 例一：
     * 发送处理消息
     */
    val mengkaService = new MengkaService("baicai", "qingcai", "xigua")
    mengkaService !(self, "baicai", "baicai AAA..")
    mengkaService !(self, "qingcai", "qingcai BBB..")
    mengkaService.start()
    mengkaService !(self, "qingcai11", "qingcai BBB..")
    mengkaService !(self, "baicai11", "baicai BBB..")

    /**
     * 循环接收mengkaService处理4条消息之后返回的结果
     *
     */
    for (i <- 1 to 4) {
      receive {
        case result => println("get result = " + result)
      }
    }

    /**
     * 退出
     * 终止actor的执行，不再接收消息
     */
    mengkaService ! "quit"

  }

}
