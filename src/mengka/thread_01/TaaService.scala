package mengka.thread_01

/**
 *  单线程：计算6是不是完全数
 *
 * User: mengka.hyy
 * Date: 14-6-7-下午2:34
 */
class TaaService {

  /**
   *  判断kk是不是完全数
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
