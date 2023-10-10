package mengka.baicai

/**
 *  自定义运算符重载类<hr>
 *    复数之间的求和运算：<br>
 *         (1+2i)+(2-3i) = 3-1i
 */
object yunsuanfu_01 {

  /**
   *   自定义的，复数类<br>
   *    【注】： 构造函数直接写在类的外面
   */
  class Complex(val real: Int, val imaginary: Int) {

    //定义复数的“加法”函数
    def +(bb: Complex): Complex =
      {
        new Complex(real + bb.real, imaginary + bb.imaginary)
      }

    //重新定义类的默认返回字符串： toString()方法
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