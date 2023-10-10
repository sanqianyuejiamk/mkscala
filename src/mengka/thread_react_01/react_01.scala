package mengka.thread_react_01

import scala.actors.Actor._

/**
 * react:
 * 1.react不具有线程关联性，一个线程发送消息，另一个线程处理消息；
 * 2.在需要快速处理大量消息的时候，react可以更友善的利用资源；
 * 3.推荐使用react()替代receive();
 *
 * <br>
 *
 * 使用receive时，每个actor运行在自己的线程里；
 * 使用react时，让actor共享来自线程池的线程；
 *
 * User: mengka
 * Date: 15-3-7-下午8:24
 */
object react_01 {

  def main(args: Array[String]): Unit = {

    /**
     * step01:
     * 启动3个线程处理不同的数据;
     * react()每使用一次，线程就会终止，必须重新新建一个对象；
     */
    val mengkaService = new MengkaService()
    mengkaService.start()
    mengkaService ! (20)

    val mengkaService2 = new MengkaService()
    mengkaService2.start()
    mengkaService2 ! (12)

    val mengkaService3 = new MengkaService()
    mengkaService3.start()
    mengkaService3 ! (4)

    /**
     * step02:
     * 打印线程返回的结果，顺序随机
     */
    for (i <- 1 to 5) {
      //使用react()，在等待接收消息时，不持有任何线程
      receive {
        case (number, result) => invokeResult(number, result)
      }
    }

  }

  def invokeResult(number: Any, result: Any): Unit = {
    println("-----------, 1*..*" + number + "=" + result+" , thread = "+Thread.currentThread())
  }

}
