package mengka.quanxian.qing

import mengka.quanxian.bai.Mengka

/**
 *   scala细粒度，权限控制的例子
 * 
 */
object testMengka {

  def main(args: Array[String]): Unit = {
    
     val mengka = new Mengka()
     
     //在“quanxian”包下，所有的类都可以访问
     println(mengka.aaQuanian)
     
     //无法访问
//     println(mengka.aaBai)
     
     
     /**
      *  利用方法，访问受限制对象的结果
      */
      mengka.foo(mengka)
  }

}