package mengka.baicai

/**
 *  ԭʼ�ַ�����ʹ��
 * 
 */
object yuanshiString_01 {

  def main(args: Array[String]): Unit = {
       
    /**
     *  ���١� ԭʼ�ַ���  """" ��ʹ��
     * 
     */
    val aaString=""" ��һ�аײ�
                  �ڶ������
      ����������"""
      
      println(aaString)
      
      
      
    /**
     *  ���ڡ� ԭʼ�ַ���  """" ��ʹ��:
     *   
     *           .stripMargin ��ȥ���ܵ�����|��ǰ��Ŀհ� 
     */
    val bbString=""" ��һ�аײ�
                 | �ڶ������
      |����������""".stripMargin
      
      println(bbString)
    
    
    /**
     *  ���ۡ� ԭʼ�ַ�������һ���÷�
     * 
     */
    val ccString = """\d2:\d2"""
    val ddString = "\\d3:\\d3"  
      
      println("ccString = "+ccString+" , ddString = "+ddString)
    
  }

}