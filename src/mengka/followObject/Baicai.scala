package mengka.followObject


class Baicai private(val kk:String){
	println("create "+this)
	
	override def toString():String = "baicai AAA: "+ kk
}
/**
 *  1. scala没有static变量,伴生对象可以弥补这一功能;
 *  2. 类构造函数为private,只有在伴生对象里面才能构造该对象;
 *    
 */
object Baicai{
  
  private val aaMap = Map(
      "aa" -> new Baicai("白菜"),
      "bb" -> new Baicai("青菜"),
      "cc" -> new Baicai("西瓜"))
      
   def getBaicai(kk:String){
    if(aaMap.contains(kk)) println(aaMap(kk)) else null
  }
  
}
