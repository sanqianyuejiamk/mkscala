package mengka.thread_reactWithin_02

import scala.actors._
import Actor._

/**
 * reactWithinʹ�ã�
 * 1.reactWithin(100)����100ms�ڣ����û���յ���Ϣ���ͻᳬʱ��
 * 2.ʹ��react()���ڵȴ�������Ϣʱ���������κ��̣߳�
 * 3.reactWithin(100)�����������̳߳ص��̣߳�
 *
 * User: mengka
 * Date: 15-3-7-����9:10
 */
object react_02 {

  val caller = self

  def main(args: Array[String]): Unit = {
    mengkaService ! 20
    mengkaService ! 11
    mengkaService ! 30
    mengkaService ! 22
    mengkaService ! 12
    mengkaService ! 32

    receiveWithin(500) {
      case result => invokeResult(result)
    }
  }

  /**
   *  ���߳����
   */
  val mengkaService = actor {
    mengkaSum(0)
  }

  def mengkaSum(total: Int): Unit = {
    reactWithin(100) {
      case num: Int =>
         println("num = "+num)
         mengkaSum(total + num)
      case TIMEOUT => caller ! total//��ʱ��ʱ�򣬷���total
    }

    println("���в��ᱻִ�У���Ϊreact()�ڲ���ͨ���׳��쳣��������ġ�����")
  }

  def invokeResult(result: Any): Unit = {
    println("-----------, result = " + result)
  }
}
