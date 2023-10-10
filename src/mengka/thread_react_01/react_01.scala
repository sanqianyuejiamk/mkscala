package mengka.thread_react_01

import scala.actors.Actor._

/**
 * react:
 * 1.react�������̹߳����ԣ�һ���̷߳�����Ϣ����һ���̴߳�����Ϣ��
 * 2.����Ҫ���ٴ��������Ϣ��ʱ��react���Ը����Ƶ�������Դ��
 * 3.�Ƽ�ʹ��react()���receive();
 *
 * <br>
 *
 * ʹ��receiveʱ��ÿ��actor�������Լ����߳��
 * ʹ��reactʱ����actor���������̳߳ص��̣߳�
 *
 * User: mengka
 * Date: 15-3-7-����8:24
 */
object react_01 {

  def main(args: Array[String]): Unit = {

    /**
     * step01:
     * ����3���̴߳���ͬ������;
     * react()ÿʹ��һ�Σ��߳̾ͻ���ֹ�����������½�һ������
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
     * ��ӡ�̷߳��صĽ����˳�����
     */
    for (i <- 1 to 5) {
      //ʹ��react()���ڵȴ�������Ϣʱ���������κ��߳�
      receive {
        case (number, result) => invokeResult(number, result)
      }
    }

  }

  def invokeResult(number: Any, result: Any): Unit = {
    println("-----------, 1*..*" + number + "=" + result+" , thread = "+Thread.currentThread())
  }

}
