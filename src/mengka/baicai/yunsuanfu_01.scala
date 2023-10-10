package mengka.baicai

/**
 *  �Զ��������������<hr>
 *    ����֮���������㣺<br>
 *         (1+2i)+(2-3i) = 3-1i
 */
object yunsuanfu_01 {

  /**
   *   �Զ���ģ�������<br>
   *    ��ע���� ���캯��ֱ��д���������
   */
  class Complex(val real: Int, val imaginary: Int) {

    //���帴���ġ��ӷ�������
    def +(bb: Complex): Complex =
      {
        new Complex(real + bb.real, imaginary + bb.imaginary)
      }

    //���¶������Ĭ�Ϸ����ַ����� toString()����
    override def toString(): String =
      {
        real + (if (imaginary < 0) "" else "+") + imaginary + "i"
      }
  }

  def main(args: Array[String]): Unit = {

    val c1 = new Complex(1, 2)
    val c2 = new Complex(2, -3)

    val sum = c1 + c2

    println("(" + c1 + ")+(" + c2 + ") = " + sum)
  }

}