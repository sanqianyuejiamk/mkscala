package mengka.thread_01

/**
 *  ���̣߳�����6�ǲ�����ȫ��
 *
 * User: mengka.hyy
 * Date: 14-6-7-����2:34
 */
class TaaService {

  /**
   *  �ж�kk�ǲ�����ȫ��
   *
   * @param kk
   * @return
   */
  def isPerfect(kk:Int):Boolean = {
    var result = false
    val sum = sumOfFactors(kk)
    println("sum["+kk+"] = "+sum)
    if(2*kk == sum){
      result = true
    }
    return result
  }

  def sumOfFactors(kk:Int):Int = {
    var sum = 0
    for(i <- 1 to kk){
      if(kk %i == 0){
        sum = sum+i
      }
    }
    return sum
  }

}
