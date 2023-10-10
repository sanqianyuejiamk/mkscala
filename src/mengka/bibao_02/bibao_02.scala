package mengka.bibao_02

/**
 *  将闭包addIt作为参数传入mengka()方法里
 *
 * User: mengka.hyy
 * Date: 14-6-7-下午2:17
 */
object bibao_02 {

  /**
   *  定义闭包addId
   */
  var result = 0
  val addIt = {kk:Int => result+=kk}

  def mengka(count:Int)(aa:Int => Unit){
    for(i <- 1 to count){
      aa(i)
    }
  }

  def main(args:Array[String]):Unit = {
      mengka(10){addIt}
      println("1+2+3+4+5+6+7+8+9+10 = "+result)
  }

}
