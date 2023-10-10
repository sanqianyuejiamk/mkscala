package mengka.time_01

import java.util.Calendar
import common.util.TimeUtil

/**
 *
 * User: mengka.hyy
 * Date: 14-6-15-下午5:50
 */
object Time_01 {

  def main(args: Array[String]): Unit = {

    /**
     *  例一：
     *
     */
    val date = Calendar.getInstance()
    println(TimeUtil.toDate(date.getTime(),"yyyy-MM-dd hh:mm:ss"))


    /**
     *  例二：
     *      获取2天前的时间
     */
    val bbDate = Calendar.getInstance()
    bbDate.add(Calendar.DAY_OF_MONTH,-2)
    println(TimeUtil.toDate(bbDate.getTime(),"yyyy-MM-dd hh:mm:ss"))

    val ccDate = Calendar.getInstance()
    ccDate.add(Calendar.DAY_OF_MONTH,5)
    println(TimeUtil.toDate(ccDate.getTime(),"yyyy-MM-dd hh:mm:ss"))
  }

}
