package mengka.baicai

/**
 *  原始字符串的使用
 * 
 */
object yuanshiString_01 {

  def main(args: Array[String]): Unit = {
       
    /**
     *  【①】 原始字符串  """" 的使用
     * 
     */
    val aaString=""" 第一行白菜
                  第二行青菜
      第三行西瓜"""
      
      println(aaString)
      
      
      
    /**
     *  【②】 原始字符串  """" 的使用:
     *   
     *           .stripMargin 会去掉管道符（|）前面的空白 
     */
    val bbString=""" 第一行白菜
                 | 第二行青菜
      |第三行西瓜""".stripMargin
      
      println(bbString)
    
    
    /**
     *  【③】 原始字符串的另一种用法
     * 
     */
    val ccString = """\d2:\d2"""
    val ddString = "\\d3:\\d3"  
      
      println("ccString = "+ccString+" , ddString = "+ddString)
    
  }

}