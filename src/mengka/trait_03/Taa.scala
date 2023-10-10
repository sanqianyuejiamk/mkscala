package mengka.trait_03

/**
 *
 *  scala��ǿ��������֮һ���������ʵ�֣ۺ���ʽ�ݵĴ��뿪��
 *
 * User: mengka.hyy
 * Date: 14-6-15-����4:56
 */
object Taa {

  def main(args:Array[String]):Unit = {

    /**
     *  ��һ�� trait�ĺ��򿪷�
     *
     *  �����ұߵ�trait˳�������ִ�У����ִ�л������trait����ķ�����
     *   Qingcai.planted()
     *   Baicai.planted()
     *   Cai.planted()
     */
    val aaCai = new Cai with Baicai with Qingcai
    println(aaCai.planted())


    /**
     * ������ trait�ĺ��򿪷�
     *
     */
    val bbCai = new Cai with Xigua with Baicai
    println(bbCai.planted())
  }
}
