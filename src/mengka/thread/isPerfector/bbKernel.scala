package mengka.thread.isPerfector

import scala.actors.Actor._


/**
 *  多核计算一个数，是不是完全数
 *
 */
object bbKernel {

  def sumOfFactorsInRange(lower:Int,upper:Int,kk:Int) = {
     (0 /: (lower to upper)){
       (sum,i) =>if(kk%i == 0 ) sum+i else sum
     }
  }

  /**
   *  多核计算一个数是不是完全数
   *    1.每100w起一个线程计算；
   *    2.对于完全数这种计算密集型的代码，最好用多核，这样可以充分利用计算资源；
   *
   * @param kk
   * @return
   */
  def isPerfectConcurrent(kk:Int) = {
    val RANGE = 1000000
    val num = (kk.toDouble/RANGE).ceil.toInt

    //self()，主线程，该变量持有actor的引用
    val caller = self

    for (i <- 0 until num){
      val lower = i*RANGE + 1
      val upper = kk min (i+1)*RANGE

      //!(),将部分和作为消息，发送给调用者
      actor{
        caller!sumOfFactorsInRange(lower,upper,kk)
      }
    }

    val sum = (0 /: (0 until num)){
      (aaSum,i) => receive{
        //receive(),从actor接收消息
        case sumInRange:Int => aaSum+sumInRange
      }
    }

    2*kk==sum
  }

  def main(args:Array[String]):Unit ={
    //计算因子之和
    println("sumOfFactorsInRange = "+sumOfFactorsInRange(1,6,6))

    //判断一个数是不是完全数
    println("6 is perfetor: "+isPerfectConcurrent(6))
  }
}