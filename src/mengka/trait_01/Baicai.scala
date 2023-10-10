package mengka.trait_01

import java.util.Date
import common.util.TimeUtil

/**
 *
 * User: mengka.hyy
 * Date: 14-6-15-обнГ3:37
 */
class Baicai(override val name:String) extends Cai{


  def baicai():String = {
    return "baicai : "+TimeUtil.toDate(new Date(),"yyyy-MM-dd HH:mm:ss")
  }
}
