package mengka.baicai.map_01

/**
 *  map的基本使用
 *
 */
object map_02 {

  def main(args: Array[String]): Unit = {

    val footballTeamsAFCEast =
      Map("New England" -> "Patriots",
        "New York" -> "Jets",
        "Buffalo" -> "Bills",
        "Miami" -> "Dolphins白菜",
        "Los Angeles" -> null)

        
    /**
     *   Some(Dolphins白菜)
     *   Dolphins白菜
     *
     */
    println(footballTeamsAFCEast.get("Miami"))
    println(footballTeamsAFCEast.get("Miami").get)

    /**
     *  map中，value == null时：
     *
     *            返回的是： Some(null)
     *
     */
    println(footballTeamsAFCEast.get("Los Angeles"))

    
    /**
     *   map中，不存在该key时：
     *
     *           返回的是：  None
     */
    println(footballTeamsAFCEast.get("mengka"))
    
  }
}