package mengka.trait_01

/**
 *
 *  trait有点像抽象类，但是比abstract具有更好的灵活性，是scala的一个强有力的工具
 *
 *  trait和抽象类的区别：
 *  1.trait编译后：一个java接口，一个对应的实现类；
 *  2.trait需要混入类中，去实现他们的使命；
 *  3.trait的构造器不能有任何参数；
 *
 * User: mengka.hyy
 * Date: 14-6-15-下午3:34
 */
trait Cai {

  val name:String

  val mengka:String = "RUC studying.."

  def plantedCai(){
      println(name+" AAA!!")
  }

}
