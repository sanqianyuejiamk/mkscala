package mengka.baicai


/**
 *   ����2�����캯����ʱ��
 * 
 *         ��ִ�У�class������Ǹ����캯����  Ȼ��ִ��������Ǹ����캯����
 */
object gouzaohanshu_02 {

   //���١������캯��
  class Person(val firstName: String, val lastName: String) {

    private var aaString: String = _

    println("�����캯��ǰ�� "+toString()+"��")

     //���ڡ������캯��
    def this(firstName: String, lastName: String, aa: String) {
      this(firstName, lastName)
      aaString = aa
    }

    /**
     *   ����ǰ��
     *       mengka.baicai.gouzaohanshu_02$Person@df8f5e
     *       
     *   ���غ�
     *       zhang san:�ײ�
     */
    override def toString(): String = {
      firstName + " " + lastName + ":" + aaString
    }
  }

  def main(args: Array[String]): Unit = {

    val aa1 = new Person("zhang", "san", "�ײ�")
    println(aa1)

    val aa2 = new Person("Li", "si")
    println(aa2)
  }
}