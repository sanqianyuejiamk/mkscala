package mengka.baicai.switch_01

/**
 * switch��ʹ��
 *  
 */
object switch_01 {

  def main(args: Array[String]): Unit = {
    
    val kk = 6
    var result = ""
    
    kk match{
      case 1 => result = "������"
      case 2 => result = "��������"
      case 3 => result = "�¹���" 
      case _ => result = "Ĭ�ϣ�������"
    }
    
    println(result)
  }

}