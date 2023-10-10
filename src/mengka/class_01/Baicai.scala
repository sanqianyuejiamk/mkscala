package mengka.class_01

/**
 *
 *  类的主构造函数和副构造函数
 *
 * User: mengka.hyy
 * Date: 14-6-7-下午12:59
 */
class Baicai(val id:Int,val name:String) {

   private var color:String = _;

   def this(id:Int,name:String,color:String){
       this(id,name);
       this.mengka = color;
   }

  /**
   * 注解@scala.reflect.BeanProperty，
   *    自动生成getMengka()和setMengka();
   */
  @scala.reflect.BeanProperty var mengka:String = _

}
