package mengka.baicai

/**
  * Created by xiafeng 
  * on 16-2-14.
  */
object for_04 {

  /**
    *  ����forѭ�������õıհ��߼�
    */
  val mengka = { tmp: Int => println(" " + tmp) }

  def main(args: Array[String]) {

    /**
      *  ����һ��
      *       ����������2
      */
    val result = (1 to 10).map(_ * 2)
    println(String.format("------------, result = %s , size = %s": String, result.toString(): String, String.valueOf(result.size): String))

    result.foreach(mengka)

    /**
      *  ��������
      *       ����������2
      */
    val list = for (i <- 1 to 10) yield i
    println("list = " + list)

    val aaList = list.map(_ * 2)
    println(String.format("------------, result = %s , size = %s": String, aaList.toString(): String, String.valueOf(aaList.size): String))

    aaList.foreach(mengka)
  }

}
