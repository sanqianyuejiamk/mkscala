package mengka.baicai

object gouzaohanshu_01 {

  class Car(val year: Int) {

    //�Զ����ɣ� getAge()��setAge()����
    //  _ ��ʹ�á�ȱʡĬ��ֵ���ı�ʾ �� Ĭ�� age = 0 
    @scala.reflect.BeanProperty var age: Int = _

    
    private var milesDriven: Int = 0

    def miles() = milesDriven

    def drive(bb: Int) {
      milesDriven += Math.abs(bb)
    }
  }

  def main(args: Array[String]): Unit = {

      val car=new Car(2009)
      
      /**
       *  scala��ɫ֮һ��
       *           ���ع��캯���еı���
       */
      println("year = "+car.year)
      
      
      /**
       *   ��������
       * 
       */
      println("miles = "+car.miles)
      
      car.drive(10)
      println("miles = "+car.miles)
      
      
      /**
       *  ʹ��Ĭ�ϵģ� getAge()��setAge()����
       * 
       */
      println("age = "+car.getAge)
       println("age = "+car.age)
  }

}