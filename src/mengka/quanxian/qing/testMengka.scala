package mengka.quanxian.qing

import mengka.quanxian.bai.Mengka

/**
 *   scalaϸ���ȣ�Ȩ�޿��Ƶ�����
 * 
 */
object testMengka {

  def main(args: Array[String]): Unit = {
    
     val mengka = new Mengka()
     
     //�ڡ�quanxian�����£����е��඼���Է���
     println(mengka.aaQuanian)
     
     //�޷�����
//     println(mengka.aaBai)
     
     
     /**
      *  ���÷��������������ƶ���Ľ��
      */
      mengka.foo(mengka)
  }

}