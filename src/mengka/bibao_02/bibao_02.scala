package mengka.bibao_02

/**
 *  ���հ�addIt��Ϊ��������mengka()������
 *
 * User: mengka.hyy
 * Date: 14-6-7-����2:17
 */
object bibao_02 {

  /**
   *  ����հ�addId
   */
  var result = 0
  val addIt = {kk:Int => result+=kk}

  def mengka(count:Int)(aa:Int => Unit){
    for(i <- 1 to count){
      aa(i)
    }
  }

  def main(args:Array[String]):Unit = {
      mengka(10){addIt}
      println("1+2+3+4+5+6+7+8+9+10 = "+result)
  }

}
