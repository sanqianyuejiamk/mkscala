package mengka.thread_03

import scala.actors.Actor._
import scala.actors.!


/**
 *  actorͬ��������Ϣ
 *      baicaiActor !?(200, "taa")
 *
 *  1. ͬ��������Ϣ����actor������Ӧ֮ǰ����һֱ���������
 *  2. ��������Ǳ�ڵ�������
 *
 * User: mengka.hyy
 * Date: 14-7-5-����8:10
 */
object Taa {

  val caller = self

  def main(args: Array[String]): Unit = {
    /**
     *  !? ͬ�����ͽ�����Ϣ
     *  ��actor������Ӧ֮ǰ����һֱ������
     */
    println(baicaiActor !?(200, "taa"))
    println(baicaiActor !?(500, "tbb"))

    /**
     *  baicaiActor�Ľ���᷵�ظ�qingcaiActor
     *
     */
    baicaiActor.send("tcc", qingcaiActor)

    baicaiActor ! "tdd"
    Thread.sleep(3000)

    receive {
      case msg: String =>
        println("receive: " + msg)
    }

    receive {
      /**
       *  ��case�࣬
       *  ��Ҫ���ڴ���ʧ����Ϣ��
       *  ������ͬ�����ͣ���ʱ��û���յ�����Ϣ��
       */
      case !(channel, msg) =>
        println("��ʧ����Ϣ��")
        println(msg)
    }
  }

  val baicaiActor = actor {
    for (i <- 1 to 4) {
      /**
       *  sender���õ������һ��������Ϣ��actor��
       *
       *  ��Ϊ��һ��baicaiActor����֮��sleep��1s�����µڶ���baicaiActor������Ϣ��ʱ�������ˣ�
       *  Ҫ�ȴ���һ�����ؽ�������ִ�У����ڶ�����Ϣ��ʧ�ˣ�
       */
      receive {
        case _ =>
          //actor���صĽ��
          sender ! "baicai AAA.." + i
      }
      Thread.sleep(1000)
    }
  }

  /**
   *  qingcaiActor��������baicaiActor���棬����baicaiActor���صĽ��
   *
   */
  val qingcaiActor = actor {
    receive {
      case msg =>
        println("qingcai = " + msg)
    }
  }

}
