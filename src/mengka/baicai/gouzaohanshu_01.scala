package mengka.baicai

object gouzaohanshu_01 {

  class Car(val year: Int) {

    //自动生成： getAge()和setAge()方法
    //  _ 是使用“缺省默认值”的表示 ， 默认 age = 0 
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
       *  scala特色之一：
       *           返回构造函数中的变量
       */
      println("year = "+car.year)
      
      
      /**
       *   正常返回
       * 
       */
      println("miles = "+car.miles)
      
      car.drive(10)
      println("miles = "+car.miles)
      
      
      /**
       *  使用默认的： getAge()和setAge()方法
       * 
       */
      println("age = "+car.getAge)
       println("age = "+car.age)
  }

}