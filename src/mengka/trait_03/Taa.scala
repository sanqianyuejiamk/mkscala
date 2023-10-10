package mengka.trait_03

/**
 *
 *  scala的强有力工具之一，可以灵活实现［横切式］的代码开发
 *
 * User: mengka.hyy
 * Date: 14-6-15-下午4:56
 */
object Taa {

  def main(args:Array[String]):Unit = {

    /**
     *  例一： trait的横向开发
     *
     *  从最右边的trait顺序向左边执行，最后执行混入这个trait的类的方法：
     *   Qingcai.planted()
     *   Baicai.planted()
     *   Cai.planted()
     */
    val aaCai = new Cai with Baicai with Qingcai
    println(aaCai.planted())


    /**
     * 例二： trait的横向开发
     *
     */
    val bbCai = new Cai with Xigua with Baicai
    println(bbCai.planted())
  }
}
