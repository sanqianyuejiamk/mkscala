package mengka.baicai.helloworld

/*
 *  scala��javaƽ̨��׷���������̽����
 *   1.����ʽ���
 *   2.���õĲ���֧�֣�
 * 
 * groovy��JRuby�Ƕ�̬���ԣ����Ǻ���ʽ�ģ������ṩ��java���õĲ�����
 * 
 * scala�����ԣ�
 *     1.�����¼��Ĳ���ģ�ͣ�
 *     2.���������
 *     3.���Ժܺõ���java��ϣ�
 *     4.������һ��΢�ں�֮�ϣ�
 */
object Hello {

  def main(args: Array[String]) {
    println("HelloWorld");

    for (i <- 1 to 3) {
      print(i + ",")
    }
  }

}
