package mengka.followObject_02

class Baicai private(val kk:String){
  println("create "+this)

  override def toString():String = "baicai AAA: "+ kk
}

/**
 *   伴生类的实例不需要重新初始化，不需要new
 *
 *      所以常常被用于：①数据库访问；②对象工厂；之类的操作
 */
object Baicai{

  private val aaMap = Map(
    "aa" -> new Baicai("白菜"),
    "bb" -> new Baicai("青菜"),
    "cc" -> new Baicai("西瓜"))


  def mengka = "访问scala里面的statis变量！"

  /*
   *  scala里面的apply(),语法糖用法，
   *      1. 伴生类的实例，不需要new;
   *      2. Baicai（"aa"）其实调用的是，Baicai.apply("aa");
   *      3. 伴生类对外开放的{aa,bb,cc}，在伴生对象里面都已经创建好了，可以给所有人共用;
   */
  def apply(kk:String) = if (aaMap.contains(kk)) aaMap(kk) else null
}