package mengka.trait_02

/**
 *
 *  同时继承多个抽象类
 *
 * User: mengka.hyy
 * Date: 14-6-15-下午4:05
 */
class Mengka extends Baicai with Qingcai{

  override def planted(){
    println("planted mengka!")
  }
}
