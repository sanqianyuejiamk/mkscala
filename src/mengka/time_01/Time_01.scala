package mengka.time_01

import java.util.Calendar
import common.util.TimeUtil

/**
 *
 * User: mengka.hyy
 * Date: 14-6-15-����5:50
 */
object Time_01 {

  def main(args: Array[String]): Unit = {

    /**
     *  ��һ��
     *
     */
    val date = Calendar.getInstance()
    println(TimeUtil.toDate(date.getTime(),"yyyy-MM-dd hh:mm:ss"))


    /**
     *  ������
     *      ��ȡ2��ǰ��ʱ��
     */
    val bbDate = Calendar.getInstance()
    bbDate.add(Calendar.DAY_OF_MONTH,-2)
    println(TimeUtil.toDate(bbDate.getTime(),"yyyy-MM-dd hh:mm:ss"))

    val ccDate = Calendar.getInstance()
    ccDate.add(Calendar.DAY_OF_MONTH,5)
    println(TimeUtil.toDate(ccDate.getTime(),"yyyy-MM-dd hh:mm:ss"))
  }

}
