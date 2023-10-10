package mengka.thread_01

/**
 *
 * ��ȫ����������֮���Ǹ��������2����
 *
 *    6 �� 1+2+3+6 �� 12 �� 2��6
 *
 *
 * User: mengka.hyy
 * Date: 14-6-7-����2:49
 */
object Taa {

  def main(args:Array[String]):Unit={

    /**
     * ��һ��
     *    ���̣߳�����6�ǲ�����ȫ��
     *
     */
    val taaService = new TaaService()
    println("6 isPerfect = "+taaService.isPerfect(6))


    println("33550300 isPerfect = "+taaService.isPerfect(33550300))


    println("\n=================\n")


    /**
     * ������
     *    ���̣߳�����һ�������ǲ�����ȫ��
     *
     *  ��33550300,33550400��������Щ����ȫ�������̵߳����ƾ����ֳ����ˣ�
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
