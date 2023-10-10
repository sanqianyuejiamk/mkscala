package mengka.actor_01

/**
 *  mengkaService退出之后，就不会再接收到消息
 *  后面发送的消息会进入队列，下次start()的时候，会优先处理队列里面的消息［未实现］
 *
 * User: mengka.hyy
 * Date: 14-7-20-上午10:35
 */
object Tbb {

  def main(args: Array[String]):Unit = {

    val mengkaService = new MengkaService("baicai","qigncai")
    mengkaService.start()

    mengkaService !"ping"
    mengkaService !"quit"
    mengkaService !"ping"
    mengkaService !"ping"

  }
}
