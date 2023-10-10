package mengka.thread.isPerfector

/**
 *  单核计算一个数，是不是完全数
 *
 */
object aaKernel {

  def sumOfFactors(kk:Int) = {
    (0 /: (1 to kk)){
       (sum,i) =>if(kk%i == 0 ) sum+i else sum
    }
  }

  /**
   *  完全数;所有的因子之和等于这个数的2倍
   * @param kk
   * @return
   */
  def isPerfect(kk:Int):String = {
     if(2*kk == sumOfFactors(kk)) "true" else "no"
  }


  def main(args: Array[String]): Unit = {

    //计算一个数的所有因子之和
    println("sumOfFactors(6) = "+sumOfFactors(6))

    //判断一个数是不是完全数
    println("6 is perfetor: "+isPerfect(6))
  }
}
