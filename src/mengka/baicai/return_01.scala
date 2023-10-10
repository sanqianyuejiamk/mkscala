package mengka.baicai


/**
 *   scala可以“自动推演”，返回的方法的类型
 * 
 */
object return_01 {

   def main(args:Array[String]):Unit = {
     
     /**  
      *   scala自带的“自动推演”的能力
      */
     def f1() = true 
     println(f1)
     
     
     /**
      *      【注：不显式指定类型，就会有编译错误】
      *  如果，return破坏scala的“自动推演”类型机制：
      *          
      *             此时，需要自己的“显式指定返回类型”
      */
     def f2():Boolean = return true
     println(f2)
     
     
   }
}