package mengka.thread.isPerfector

import scala.actors.Actor._


/**
 *  ��˼���һ�������ǲ�����ȫ��
 *
 */
object bbKernel {

  def sumOfFactorsInRange(lower:Int,upper:Int,kk:Int) = {
     (0 /: (lower to upper)){
       (sum,i) =>if(kk%i == 0 ) sum+i else sum
     }
  }

  /**
   *  ��˼���һ�����ǲ�����ȫ��
   *    1.ÿ100w��һ���̼߳��㣻
   *    2.������ȫ�����ּ����ܼ��͵Ĵ��룬����ö�ˣ��������Գ�����ü�����Դ��
   *
   * @param kk
   * @return
   */
  def isPerfectConcurrent(kk:Int) = {
    val RANGE = 1000000
    val num = (kk.toDouble/RANGE).ceil.toInt

    //self()�����̣߳��ñ�������actor������
    val caller = self

    for (i <- 0 until num){
      val lower = i*RANGE + 1
      val upper = kk min (i+1)*RANGE

      //!(),�����ֺ���Ϊ��Ϣ�����͸�������
      actor{
        caller!sumOfFactorsInRange(lower,upper,kk)
      }
    }

    val sum = (0 /: (0 until num)){
      (aaSum,i) => receive{
        //receive(),��actor������Ϣ
        case sumInRange:Int => aaSum+sumInRange
      }
    }

    2*kk==sum
  }

  def main(args:Array[String]):Unit ={
    //��������֮��
    println("sumOfFactorsInRange = "+sumOfFactorsInRange(1,6,6))

    //�ж�һ�����ǲ�����ȫ��
    println("6 is perfetor: "+isPerfectConcurrent(6))
  }
}