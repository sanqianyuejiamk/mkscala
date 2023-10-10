package mengka.thread_03

import scala.actors.Actor._
import scala.actors.!


/**
 *  actor同步发送消息
 *      baicaiActor !?(200, "taa")
 *
 *  1. 同步发送消息，在actor给出响应之前，会一直阻塞在那里；
 *  2. 可能引起潜在的死锁；
 *
 * User: mengka.hyy
 * Date: 14-7-5-下午8:10
 */
object Taa {

  val caller = self

  def main(args: Array[String]): Unit = {
    /**
     *  !? 同步发送接收消息
     *  在actor给出响应之前，会一直阻塞；
     */
    println(baicaiActor !?(200, "taa"))
    println(baicaiActor !?(500, "tbb"))

    /**
     *  baicaiActor的结果会返回给qingcaiActor
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
       *  该case类，
       *  主要用于处理丢失的消息；
       *  （处理同步发送，因超时而没有收到的消息）
       */
      case !(channel, msg) =>
        println("丢失的消息：")
        println(msg)
    }
  }

  val baicaiActor = actor {
    for (i <- 1 to 4) {
      /**
       *  sender引用的是最近一个发送消息的actor；
       *
       *  因为第一个baicaiActor发送之后，sleep了1s，导致第二个baicaiActor发送消息的时候阻塞了，
       *  要等待第一个返回结果后才能执行，最后第二条消息丢失了；
       */
      receive {
        case _ =>
          //actor返回的结果
          sender ! "baicai AAA.." + i
      }
      Thread.sleep(1000)
    }
  }

  /**
   *  qingcaiActor被传进了baicaiActor里面，处理baicaiActor返回的结果
   *
   */
  val qingcaiActor = actor {
    receive {
      case msg =>
        println("qingcai = " + msg)
    }
  }

}
