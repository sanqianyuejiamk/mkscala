package mengka.thread_02

import scala.actors.Actor._

/**
 *
 *  actor�첽������Ϣ��
 *       mengkaActor!"hello baicai"
 *
 *  1. ������Ϣ������������Ҫ�ȴ�mengkaActor{..}������Ӧ�����ܼ�������Ĳ�����
 *  2. ÿ��actor�����Լ�����Ϣ���У�����InputChannel[Any]������Ϣ��ͨ��OutputChannel[Any]���������
 *  3. ��actor�뿪���߲���Ӧ����Ϣ��ʱ�򣬸���Ϣ�ͻ�洢����Ϣ�������棬����ʱ��ȡ����
 *
 * User: mengka.hyy
 * Date: 14-7-5-����7:35
 */
object Taa {

  var t1: Long = 0

  /**
   *  self(),���߳�
   *  �ñ�������actor�����ã�
   */
  val caller = self

  def main(args: Array[String]): Unit = {

    receive{
      case kk =>
         println("AAA.."+kk)
    }

    println("sending message..")
    t1 = System.currentTimeMillis()

    /**
     *  ������Ϣ�ǲ������ģ��첽���ã�
     *       t3 = 0ms,���ͼ���������ʱ��
     */
    mengkaActor!"hello baicai"

    val t3 = System.currentTimeMillis() - t1
    println("take "+t3+"ms to send message")

    receive{
      case mm =>
        println("BBB.."+mm)
    }
  }

  val mengkaActor = actor{
    println("message count1 = "+mailboxSize)

    caller!"send.."

    /**
     *  ������Ϣ���жϣ�
     *      ���ԣ��ڵ���receive{..}֮ǰ����һֱ��������
     */
    Thread.sleep(3000)
    println("message count2 = "+mailboxSize)

    receive{
      /**
       *  ������Ϣ���жϣ�
       *       t2 = 2998ms,��Ҫ�ȴ�sleep����
       */
      case msg =>
          val t2 = System.currentTimeMillis() - t1
          println("receive message = "+msg+" , time = "+t2)
    }

    caller!"received.."
  }


}
