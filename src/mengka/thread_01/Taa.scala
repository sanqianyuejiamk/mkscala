package mengka.thread_01

/**
 *
 * 完全数：其因子之和是该数本身的2倍；
 *
 *    6 ＝ 1+2+3+6 ＝ 12 ＝ 2＊6
 *
 *
 * User: mengka.hyy
 * Date: 14-6-7-下午2:49
 */
object Taa {

  def main(args:Array[String]):Unit={

    /**
     * 例一：
     *    单线程：计算6是不是完全数
     *
     */
    val taaService = new TaaService()
    println("6 isPerfect = "+taaService.isPerfect(6))


    println("33550300 isPerfect = "+taaService.isPerfect(33550300))


    println("\n=================\n")


    /**
     * 例二：
     *    单线程，计算一批大数是不是完全数
     *
     *  ［33550300,33550400］里面哪些是完全数，单线程的劣势就体现出来了，
     *
     *        take time 14.224s
     */
    val start = System.nanoTime()

    findPerfect(33550300,33550400,taaService.isPerfect)

    val end = System.nanoTime()
    val time = (end-start)/1000000

    println("take time "+time.toDouble/1000+"s")

  }


  /**
   *  寻找完全数
   *
   * @param lower
   * @param upper
   * @param isPerfect
   */
  def findPerfect(lower:Int,upper:Int,isPerfect:Int=>Boolean){
    //寻找完全数
    for(i <- lower to upper){
      if(isPerfect(i)){
        println(i+" is perfect!")
      }
    }
  }

}
