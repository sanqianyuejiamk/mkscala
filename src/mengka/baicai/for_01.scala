package mengka.baicai


/**
 *  forѭ������֪ʶ
 * 
 */
object for_01 {

  def main(args: Array[String]): Unit = {
    
    /**
     *  ���٣�       forѭ��
     */
     println("�����١�");
     
     for (i <- 1 to 3) {
      
       print("n = "+i + ",")
     }
     
     
    /**
     *  ���ڣ�       forѭ��
     */
     println("\n�����ڡ�");
     
     for(i <- 1 until 4){
        print("n = "+i + ",")
     }
     
     
    /**
     *  ���ۣ�       forѭ��
     */
     println("\n�����ۡ�");
     
     (1 to 3).foreach(i => print("n = "+i + ","))
     print("\n")
     //2�ַ���ԭ����һ���ģ�    1.to(3) ���Լ���д��   (1 to 3)
     (1.to(3)).foreach(i => print("n = "+i + ","))
  }

}