package mengka.baicai.helloworld

/*
 *  scala是java平台上追求表现力的探索：
 *   1.函数式风格；
 *   2.良好的并发支持；
 * 
 * groovy和JRuby是动态语言，不是函数式的，不能提供比java更好的并发；
 * 
 * scala的特性：
 *     1.基于事件的并发模型；
 *     2.纯面向对象；
 *     3.可以很好的与java混合；
 *     4.构建于一个微内核之上；
 */
object Hello {

  def main(args: Array[String]) {
    println("HelloWorld");

    for (i <- 1 to 3) {
      print(i + ",")
    }
  }

}
