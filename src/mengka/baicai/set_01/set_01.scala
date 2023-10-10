package mengka.baicai.set_01

/**
  * Created by xiafeng 
  * on 16-2-14.
  */
object set_01 {

  def main(args: Array[String]) {

    val feedSet = Set("mengka AAA..", "mengka BBB..", "mengka CCC..")

    println("------------, feedSet size = "+feedSet.size)

    /**
      *  ±éÀúset-±Õ°ü
      */
    val mengka = { tmp: String
    => println("feedSet = " + tmp)
    }
    feedSet.foreach(mengka)
  }
}
