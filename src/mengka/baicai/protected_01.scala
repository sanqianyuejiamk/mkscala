package mengka.baicai

/**
 *   protected修饰符的使用：
 *   
 *         只有派生类才能访问，且只能访问属于自己的那个protected变量
 *              【注：java中是，任何包的派生类和当前包的任何类都可以访问protected变量】
 */
object protected_01 {

  /**
   *  父类
   */
  class Baicai {
    protected def aa():String = {"大包菜"}
    var aaString:String = "蒙卡测试AAA"
  }

  /**
   *  子类
   */
  class Qingcai extends Baicai {

//    var aaString:String = "蒙卡测试AAA"
    
    def bb():String = {
      aa()
    }

    def this(tempString:String)
    {
      this()
      aaString = tempString 
    }
    
    def getaaString():String = {
      aaString
    }
    
    /**
     *  只能获取自己的那个protected变量
     */
    def aaMengka(kk:Qingcai):String = {
      kk.aaString
    }
    
     /**
      *  不能获取父类的protected变量
      */
//    def bbMengka(kk:Baicai){
//      kk.aa()
//    }
  }

  def main(args: Array[String]): Unit = {

    var aaBaicai = new Baicai()
    
    val aaQingcai = new Qingcai("蒙卡aaaaaa")
    val bbQingcai = new Qingcai()
    
    println(aaQingcai.aaMengka(bbQingcai))
    println(aaQingcai.getaaString)
    
     println(bbQingcai.getaaString)
     println(bbQingcai.bb)
  }

}