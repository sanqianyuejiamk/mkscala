package mengka.actor_02

import scala.actors._

/**
 *  actor������Ϣ������һ��:
 *    extends Actor;
 *    ʵ��act()����;
 *
 * User: mengka
 * Date: 15-2-25-����2:17
 */
class MengkaServer extends Actor {

  override def act(): Unit = {
    while (true) {
      receive {
        case (caller: Actor, message: String) =>
          caller ! (message)
        case "quit" =>
          /**
           * ����exit()������ֹͣactor�����У�
           */
          println("exiting mengkaService..")
          exit
      }
    }
  }

}
