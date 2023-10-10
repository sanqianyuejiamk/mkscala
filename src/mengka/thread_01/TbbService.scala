package mengka.thread_01

import scala.actors.Actor._

/**
 *  多线程计算完全数
 *
 * User: mengka.hyy
 * Date: 14-6-7-下午3:13
 */
class TbbService {


  val RANGE = 10000//将大数按10000分成多个区间块

  /**
   *  求出［lower,upper］范围内，是kk的因子的数的和
   *
   * @param lower
   * @param upper
   * @param kk
   * @return
   */
  def sumInRange(lower:Int,upper:Int,kk:Int):Int = {
    var sumInRange = 0
    for(i <- lower to upper){
      if(kk%i == 0){
        sumInRange+=i
      }
    }
    return sumInRange
  }


  /**
   * 判断kk是不是完全数
   *
   * @param kk
   */
  def isPerfect(kk:Int):Boolean = {
    var result = false
    val num = (kk.toDouble/RANGE).ceil.toInt

    val caller = self

    for(i <- 0 until num){
      val lower = i*RANGE + 1
      val upper = kk min (i+1)*RANGE

      actor{
        caller!sumInRange(lower,upper,kk)
      }
    }


/*
    val sum = receiveSumInRange(num)
 */
    val sum = (0 /: (0 until num)){(tmpSum,i) =>
       receive{
         case sumInRange:Int => tmpSum+sumInRange
       }
    }


    println("sum["+kk+"] = "+sum)
    if(2*kk == sum){
      result = true
    }
    return result
  }

 /*
  def receiveSumInRange(num:Int):Int = {
    for(i <- 0 until num){
      receive{
        case sumInRange:Int => tmpSum+sumInRange
      }
    }
  }
  */
}
