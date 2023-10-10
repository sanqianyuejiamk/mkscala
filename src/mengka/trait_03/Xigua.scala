package mengka.trait_03

/**
 *
 * User: mengka.hyy
 * Date: 14-6-15-下午5:10
 */
trait Xigua extends Cai{

  /**
   *  super.planted()并不是调用父类的方法，而是对左边混入的trait的调用；
   *
   * @return
   */
  override def planted():String = "xigua AAA.."+super.planted()

}
