package mengka.thread.isPerfector

/**
 *  ���˼���һ�������ǲ�����ȫ��
 *
 */
object aaKernel {

  def sumOfFactors(kk:Int) = {
    (0 /: (1 to kk)){
       (sum,i) =>if(kk%i == 0 ) sum+i else sum
    }
  }

  /**
   *  ��ȫ��;���е�����֮�͵����������2��
   * @param kk
   * @return
   */
  def isPerfect(kk:Int):String = {
     if(2*kk == sumOfFactors(kk)) "true" else "no"
  }


  def main(args: Array[String]): Unit = {

    //����һ��������������֮��
    println("sumOfFactors(6) = "+sumOfFactors(6))

    //�ж�һ�����ǲ�����ȫ��
    println("6 is perfetor: "+isPerfect(6))
  }
}
