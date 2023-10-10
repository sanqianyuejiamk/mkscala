package mengka.quanxian.bai

/**
 *   scala�£�ϸ���ȵ�Ȩ�޿��Ƶ�����
 *      1.privateĬ�ϵĿɼ�������һ����
 *      2.protected[this]���ֶ�ֻ���������ʵ���������Է��ʣ�
 */
class Mengka {

  /**
   *  mengka.quanxian.bai�����ſ��Է���
   */
  private[bai] var aaBai = "��mengka.quanxian.bai�����ſ��Է��ʡ�"

  /**
   *  mengka.quanxian���£��ſ��Է���
   */
  private[quanxian] var aaQuanian = "��mengka.quanxian���£��ſ��Է��ʡ�"

  /**
   *  ֻ����ʽ����this�ſ��Է��ʣ��޷�ͨ������ʵ�����ʣ�
   *
   */
  private[this] var aaThis = "��ֻ����this.aaThis���ʡ�"

  
  /**
   *  test
   */
  def foo(mengka: Mengka) {
    println("aaBai = " + mengka.aaBai + " , aaThis = " + this.aaThis)
  }

}