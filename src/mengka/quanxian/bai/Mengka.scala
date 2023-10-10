package mengka.quanxian.bai

/**
 *   scala下，细粒度的权限控制的例子
 *      1.private默认的可见性在类一级；
 *      2.protected[this]的字段只有派生类的实例方法可以访问；
 */
class Mengka {

  /**
   *  mengka.quanxian.bai包，才可以访问
   */
  private[bai] var aaBai = "【mengka.quanxian.bai包，才可以访问】"

  /**
   *  mengka.quanxian包下，才可以访问
   */
  private[quanxian] var aaQuanian = "【mengka.quanxian包下，才可以访问】"

  /**
   *  只有隐式对象this才可以访问（无法通过其他实例访问）
   *
   */
  private[this] var aaThis = "【只能用this.aaThis访问】"

  
  /**
   *  test
   */
  def foo(mengka: Mengka) {
    println("aaBai = " + mengka.aaBai + " , aaThis = " + this.aaThis)
  }

}