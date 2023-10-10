package mengka.implicit_01

import java.util.{Calendar, Date}

/**
 *
 * 隐式转换： 将int数字默认转换成DateHelper
 *
 * User: mengka.hyy
 * Date: 14-6-15-下午5:57
 */
class DateHelper(kk:Int) {

  /**
   * 隐式转换的
   *
   * @return
   */
  def days(key : String): Date = {
    val date = Calendar.getInstance()
    key match {
      case DateHelper.AGO => date.add(Calendar.DAY_OF_MONTH,-kk)
      case DateHelper.FROM_NOW => date.add(Calendar.DAY_OF_MONTH,kk)
      case _ => date
    }
    return date.getTime
  }

}

/**
 * 伴生对象
 *
 */
object DateHelper {

  val AGO = "ago"
  val FROM_NOW = "from_now"

  implicit def convertInt2DateHelper(kk:Int) = new DateHelper(kk)
}
