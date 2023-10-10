package mengka.baicai


/**
 *    scala ��û�����㣬�����С������������<br>
 *     �����ӡ��������������֮�������˳��
 *        
 *            �ȵ���<*>�ķ������ڵ���<+>�ķ���   ��ע�� ����ʵ�� ��ʡ�Ե�.()���ŵĲ��ص�˳��
 *            
 *           (1+4i) + (2-3i)*(2+2i) = 11+2i
 */
object yunsuanfu_02 {

  /**
   *   �Զ���ģ�������<br>
   *    ��ע���� ���캯��ֱ��д���������
   */
  class Complex(val real: Int, val imaginary: Int) {

    //���帴���ġ��ӷ�������
    def +(bb: Complex): Complex =
      {
        println("���� : <+>")
        new Complex(real + bb.real, imaginary + bb.imaginary)
      }

    def *(bb: Complex): Complex = {
      println("���� : <*>")
      new Complex(real + bb.real - imaginary * bb.imaginary, real * bb.imaginary + imaginary * bb.real)
    }

    //���¶������Ĭ�Ϸ����ַ����� toString()����
    override def toString(): String =
      {
        real + (if (imaginary < 0) "" else "+") + imaginary + "i"
      }
  }

  def main(args: Array[String]): Unit = {

    val c1 = new Complex(1, 4)
    val c2 = new Complex(2, -3)
    val c3 = new Complex(2, 2)

    println(c1 + c2 * c3)
  }

}