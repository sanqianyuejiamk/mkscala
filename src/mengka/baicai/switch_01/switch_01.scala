package mengka.baicai.switch_01

/**
 * switch的使用
 *  
 */
object switch_01 {

  def main(args: Array[String]): Unit = {
    
    val kk = 6
    var result = ""
    
    kk match{
      case 1 => result = "荷兰队"
      case 2 => result = "西班牙队"
      case 3 => result = "德国队" 
      case _ => result = "默认－巴西队"
    }
    
    println(result)
  }

}