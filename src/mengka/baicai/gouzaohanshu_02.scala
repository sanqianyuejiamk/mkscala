package mengka.baicai


/**
 *   当有2个构造函数的时候，
 * 
 *         先执行，class外面的那个构造函数；  然后，执行里面的那个构造函数；
 */
object gouzaohanshu_02 {

   //【①】主构造函数
  class Person(val firstName: String, val lastName: String) {

    private var aaString: String = _

    println("【副造函数前： "+toString()+"】")

     //【②】副构造函数
    def this(firstName: String, lastName: String, aa: String) {
      this(firstName, lastName)
      aaString = aa
    }

    /**
     *   重载前：
     *       mengka.baicai.gouzaohanshu_02$Person@df8f5e
     *       
     *   重载后：
     *       zhang san:白菜
     */
    override def toString(): String = {
      firstName + " " + lastName + ":" + aaString
    }
  }

  def main(args: Array[String]): Unit = {

    val aa1 = new Person("zhang", "san", "白菜")
    println(aa1)

    val aa2 = new Person("Li", "si")
    println(aa2)
  }
}