package mengka.implicit_01

import java.util.{Calendar, Date}

/**
 *
 * ��ʽת���� ��int����Ĭ��ת����DateHelper
 *
 * User: mengka.hyy
 * Date: 14-6-15-����5:57
 */
class DateHelper(kk:Int) {

  /**
   * ��ʽת����
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
 * ��������
 *
 */
object DateHelper {

  val AGO = "ago"
  val FROM_NOW = "from_now"

  implicit def convertInt2DateHelper(kk:Int) = new DateHelper(kk)
}
