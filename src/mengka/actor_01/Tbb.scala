package mengka.actor_01

/**
 *  mengkaService�˳�֮�󣬾Ͳ����ٽ��յ���Ϣ
 *  ���淢�͵���Ϣ�������У��´�start()��ʱ�򣬻����ȴ�������������Ϣ��δʵ�֣�
 *
 * User: mengka.hyy
 * Date: 14-7-20-����10:35
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
