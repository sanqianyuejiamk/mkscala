package mengka.trait_02

/**
 * 同时继承多个Trait
 *
 * User: mengka.hyy
 * Date: 14-6-15-下午4:08
 */
object Taa {

  def main(args: Array[String]): Unit = {

    def mengka = new Mengka()

    pbaicai(mengka)
    pqingcai(mengka)

    mengka.planted()

  }

  def pbaicai(baicai: Baicai) {
    println(baicai.bname)
    baicai.planted()
  }

  def pqingcai(qingcai: Qingcai) {
    println(qingcai.qname)
    qingcai.planted()
  }

}
