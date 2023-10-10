package mengka.actor_02

import scala.actors._

/**
 *  actor发送消息【方法一】:
 *    extends Actor;
 *    实现act()方法;
 *
 * User: mengka
 * Date: 15-2-25-下午2:17
 */
class MengkaServer extends Actor {

  override def act(): Unit = {
    while (true) {
      receive {
        case (caller: Actor, message: String) =>
          caller ! (message)
        case "quit" =>
          /**
           * 调用exit()方法，停止actor的运行；
           */
          println("exiting mengkaService..")
          exit
      }
    }
  }

}
