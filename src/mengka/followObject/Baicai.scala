package mengka.followObject


class Baicai private(val kk:String){
	println("create "+this)
	
	override def toString():String = "baicai AAA: "+ kk
}
/**
 *  1. scalaû��static����,������������ֲ���һ����;
 *  2. �๹�캯��Ϊprivate,ֻ���ڰ�������������ܹ���ö���;
 *    
 */
object Baicai{
  
  private val aaMap = Map(
      "aa" -> new Baicai("�ײ�"),
      "bb" -> new Baicai("���"),
      "cc" -> new Baicai("����"))
      
   def getBaicai(kk:String){
    if(aaMap.contains(kk)) println(aaMap(kk)) else null
  }
  
}
