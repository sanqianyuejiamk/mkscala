package mengka.implicit_01

import DateHelper._
import common.util.TimeUtil

/**
 *  ��ʽת����
 *
 *    ����2: ͬ����ʽת����DateHelper
 *    days: ����DateHelper.days()����
 *   ��ago��: ���ݸ�ago()�����Ĳ���
 *
 * User: mengka.hyy
 * Date: 14-6-15-����6:13
 */
object Taa {

  def main(args: Array[String]): Unit = {

    /**
     * ��һ��
     *    2��ǰ
     */
    val aa = 2 days "ago"
    println(TimeUtil.toDate(aa,"yyyy-MM-dd HH:mm:ss"))


    /**
     * ������
     *     5���
     */
    val bb = 5 days "from_now"
    println(TimeUtil.toDate(bb,"yyyy-MM-dd HH:mm:ss"))
  }
}
