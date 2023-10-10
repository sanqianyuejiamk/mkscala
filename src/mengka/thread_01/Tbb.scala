package mengka.thread_01

/**
 *
 * User: mengka.hyy
 * Date: 14-6-7-����4:18
 */
object Tbb {

  def main(args:Array[String]):Unit={

    /**
     *  ��һ��
     *    ���̣߳�����һ�������ǲ�����ȫ��
     *
     *  ��33550300,33550400��������Щ����ȫ����
     *
     *        take time 4.202s
     *
     * ��ע�ݣ����߳����棬����������10000�����飬���ݿ����������̸߳������ٶ��ϱȵ��߳̿���4���������̣߳�14.224s��
     */
    val tbbService = new TbbService()

    val start = System.nanoTime()

    findPerfect(33550300,33550400,tbbService.isPerfect)

    val end = System.nanoTime()
    val time = (end-start)/1000000

    println("take time "+time.toDouble/1000+"s")
  }

  /**
   *  Ѱ����ȫ��
   *
   * @param lower
   * @param upper
   * @param isPerfect
   */
  def findPerfect(lower:Int,upper:Int,isPerfect:Int=>Boolean){
    //Ѱ����ȫ��
    for(i <- lower to upper){
      if(isPerfect(i)){
        println(i+" is perfect!")
      }
    }
  }

}
