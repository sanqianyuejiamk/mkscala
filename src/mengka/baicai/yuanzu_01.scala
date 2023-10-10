package mengka.baicai


/**
 *   元组在scala中的使用
 * 
 */
object yuanzu_01 {

  def mengka(kk: Int) = {
    ("baicai", "mengka测试AAA", "hyy044101331@163.com")
  }

  def main(args: Array[String]): Unit = {


     val (aa2, bb2, cc2) = mengka(2)

      println("aa2 = "+aa2+" , bb2 = "+bb2+" , cc2 = "+cc2)
  }

}