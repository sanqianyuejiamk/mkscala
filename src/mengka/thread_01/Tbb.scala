package mengka.thread_01

/**
 *
 * User: mengka.hyy
 * Date: 14-6-7-下午4:18
 */
object Tbb {

  def main(args:Array[String]):Unit={

    /**
     *  例一：
     *    多线程，计算一批大数是不是完全数
     *
     *  ［33550300,33550400］里面哪些是完全数，
     *
     *        take time 4.202s
     *
     * ［注］：多线程里面，将大数按照10000分区块，根据块数，决定线程个数，速度上比单线程快了4倍；（单线程：14.224s）
     */
    val tbbService = new TbbService()

    val start = System.nanoTime()

    findPerfect(33550300,33550400,tbbService.isPerfect)

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
