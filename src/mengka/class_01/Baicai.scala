package mengka.class_01

/**
 *
 *  ��������캯���͸����캯��
 *
 * User: mengka.hyy
 * Date: 14-6-7-����12:59
 */
class Baicai(val id:Int,val name:String) {

   private var color:String = _;

   def this(id:Int,name:String,color:String){
       this(id,name);
       this.mengka = color;
   }

  /**
   * ע��@scala.reflect.BeanProperty��
   *    �Զ�����getMengka()��setMengka();
   */
  @scala.reflect.BeanProperty var mengka:String = _

}
