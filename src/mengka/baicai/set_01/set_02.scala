package mengka.baicai.set_01

/**
  * Created by xiafeng 
  * on 16-2-14.
  */
object set_02 {

  def main(args: Array[String]) {
    val feedSet = Set("mengka AAA..", "mengka BBB..", "mengka CCC..","hyy AAA..")

    val aaSet = feedSet.filter(_ contains "AAA")

    aaSet.foreach{tmp: String
    => println("feedSet filter AAA = " + tmp)}
  }
}
