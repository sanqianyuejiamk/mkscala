package mengka.baicai


/**
 *  for循环基础知识
 * 
 */
object for_01 {

  def main(args: Array[String]): Unit = {
    
    /**
     *  法①：       for循环
     */
     println("【法①】");
     
     for (i <- 1 to 3) {
      
       print("n = "+i + ",")
     }
     
     
    /**
     *  法②：       for循环
     */
     println("\n【法②】");
     
     for(i <- 1 until 4){
        print("n = "+i + ",")
     }
     
     
    /**
     *  法③：       for循环
     */
     println("\n【法③】");
     
     (1 to 3).foreach(i => print("n = "+i + ","))
     print("\n")
     //2种方法原理是一样的，    1.to(3) 可以简略写成   (1 to 3)
     (1.to(3)).foreach(i => print("n = "+i + ","))
  }

}