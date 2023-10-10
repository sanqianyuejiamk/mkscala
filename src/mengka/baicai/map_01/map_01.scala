package mengka.baicai.map_01

object map_01 {

  def main(args: Array[String]): Unit = {
    
    val aaMap = Map(
    "aa" -> "test1",
    "bb" -> "test2",
    "cc" -> "test3")

    println(aaMap("aa"))
    println(aaMap.get("bb").get)
  
    val iterator = aaMap.iterator
    while(iterator.hasNext){
      val entry = iterator.next()
      println("key = "+entry._1+" , value = "+entry._2)
    }
    
    
  }

}