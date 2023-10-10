package mengka.implicit_01

import DateHelper._
import common.util.TimeUtil

/**
 *  隐式转换：
 *
 *    数字2: 同过隐式转换成DateHelper
 *    days: 调用DateHelper.days()方法
 *   “ago”: 传递给ago()方法的参数
 *
 * User: mengka.hyy
 * Date: 14-6-15-下午6:13
 */
object Taa {

  def main(args: Array[String]): Unit = {

    /**
     * 例一：
     *    2天前
     */
    val aa = 2 days "ago"
    println(TimeUtil.toDate(aa,"yyyy-MM-dd HH:mm:ss"))


    /**
     * 例二：
     *     5天后
     */
    val bb = 5 days "from_now"
    println(TimeUtil.toDate(bb,"yyyy-MM-dd HH:mm:ss"))
  }
}
