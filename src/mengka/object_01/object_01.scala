package mengka.object_01

/**
 * 【object，单例的一个例子】
 * 
 *  object,创建单例对象的时候使用，
 *
 * 单例对象不能初始化，所以不能给他们的主构造函数传递参数；
 *
 *
 */
object object_01 {

  class Market(val kk:String){
    
    println("【初始化"+kk+"】测试AAA: "+this)
    
    override def toString():String = "【打印对象】Market AAA:"+kk
  }
  
  
  /**
   *  单例对象
   *   1. 无法初始化;
   *   2. 主构造函数无法传递参数;
   */
  object Baicai{
    
    private val aaMap = Map(
    	"red" -> new Market("红色AAA"),
    	"blue" -> new Market("蓝色AAA"),
    	"green" -> new Market("绿色AAA")
    )
    
    def getBaicai(kk:String){
      if(aaMap.contains(kk)){
        println("BBB"+aaMap.get(kk).toString())
      }
    }
    
  }
  
  
  
  def main(args: Array[String]): Unit = {
		  
     println(Baicai getBaicai "blue")
  }
}