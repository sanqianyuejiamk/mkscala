package mengka.thread_02

import scala.actors.Actor._

/**
 *
 *  actor异步发送消息：
 *       mengkaActor!"hello baicai"
 *
 *  1. 发送消息不阻塞，不需要等待mengkaActor{..}给出响应，就能继续后面的操作；
 *  2. 每个actor都有自己的消息队列，它从InputChannel[Any]接收消息，通过OutputChannel[Any]发送输出；
 *  3. 当actor离开或者不能应答消息的时候，该消息就会存储到消息队列里面，方便时再取出；
 *
 * User: mengka.hyy
 * Date: 14-7-5-下午7:35
 */
object Taa {

  var t1: Long = 0

  /**
   *  self(),主线程
   *  该变量持有actor的引用；
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
     *  发送消息是不阻塞的（异步调用）
     *       t3 = 0ms,发送几乎不花费时间
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
     *  接收消息不中断：
     *      所以，在调用receive{..}之前，会一直等在这里
     */
    Thread.sleep(3000)
    println("message count2 = "+mailboxSize)

    receive{
      /**
       *  接收消息不中断：
       *       t2 = 2998ms,需要等待sleep醒来
       */
      case msg =>
          val t2 = System.currentTimeMillis() - t1
          println("receive message = "+msg+" , time = "+t2)
    }

    caller!"received.."
  }


}
