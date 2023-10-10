package mengka.bibao_01

/**
 *
 * User: mengka.hyy
 * Date: 14-6-7-下午2:05
 */
object bibao_01 {

  /**
   * 将闭包作为参数aa
   *
   * @param count
   * @param aa
   * @return
   */
  def mengka(count:Int)(aa:Int => Unit){
    for(i <- 1 to count){
      aa(i)
    }
  }

  def main(args:Array[String]):Unit = {

    var kk =1
    mengka(5){kk*=_}
    println("1*2*3*4*5 = "+kk)
  }

}
