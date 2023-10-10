package mengka.baicai


/**
 *    scala 中没有运算，但是有“运算符”方法<br>
 *     【例子】：运算符方法，之间的运算顺序
 *        
 *            先调用<*>的方法，在调用<+>的方法   【注： 这其实是 ，省略的.()符号的补回的顺序】
 *            
 *           (1+4i) + (2-3i)*(2+2i) = 11+2i
 */
object yunsuanfu_02 {

  /**
   *   自定义的，复数类<br>
   *    【注】： 构造函数直接写在类的外面
   */
  class Complex(val real: Int, val imaginary: Int) {

    //定义复数的“加法”函数
    def +(bb: Complex): Complex =
      {
        println("调用 : <+>")
        new Complex(real + bb.real, imaginary + bb.imaginary)
      }

    def *(bb: Complex): Complex = {
      println("调用 : <*>")
      new Complex(real + bb.real - imaginary * bb.imaginary, real * bb.imaginary + imaginary * bb.real)
    }

    //重新定义类的默认返回字符串： toString()方法
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