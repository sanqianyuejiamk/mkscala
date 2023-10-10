package mengka.trait_01

import java.util.Date
import common.util.TimeUtil

/**
 *
 * User: mengka.hyy
 * Date: 14-6-15-обнГ3:38
 */
class Qingcai(override val name:String) extends Cai{

  def qingcai():String = {
    return "qingcai "+TimeUtil.toDate(new Date(),"yyyy-MM-dd HH:mm:ss")
  }
}
