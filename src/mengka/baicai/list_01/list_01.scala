package mengka.baicai.list_01

object list_01 {

  def main(args: Array[String]): Unit = {

    /**
     * ��һ��  
     *   forѭ��
     */
    val list = List(11, 21, 31, 41, 51, 6)
    val size = list.length
    for (i <- 0 until size) {
      println(i + " = " + list(i))
    }
    
    /**
     * ������  
     *   list.foreach
     */   
    list.foreach(tmp => println("tmp = "+tmp))
    
    
    /**
     * ������  
     *    �հ�
     */   
    val mengka = {tmp:Int 
            => println("mengka = "+tmp)}
    list.foreach(mengka)
  }

}