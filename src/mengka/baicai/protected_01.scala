package mengka.baicai

/**
 *   protected���η���ʹ�ã�
 *   
 *         ֻ����������ܷ��ʣ���ֻ�ܷ��������Լ����Ǹ�protected����
 *              ��ע��java���ǣ��κΰ���������͵�ǰ�����κ��඼���Է���protected������
 */
object protected_01 {

  /**
   *  ����
   */
  class Baicai {
    protected def aa():String = {"�����"}
    var aaString:String = "�ɿ�����AAA"
  }

  /**
   *  ����
   */
  class Qingcai extends Baicai {

//    var aaString:String = "�ɿ�����AAA"
    
    def bb():String = {
      aa()
    }

    def this(tempString:String)
    {
      this()
      aaString = tempString 
    }
    
    def getaaString():String = {
      aaString
    }
    
    /**
     *  ֻ�ܻ�ȡ�Լ����Ǹ�protected����
     */
    def aaMengka(kk:Qingcai):String = {
      kk.aaString
    }
    
     /**
      *  ���ܻ�ȡ�����protected����
      */
//    def bbMengka(kk:Baicai){
//      kk.aa()
//    }
  }

  def main(args: Array[String]): Unit = {

    var aaBaicai = new Baicai()
    
    val aaQingcai = new Qingcai("�ɿ�aaaaaa")
    val bbQingcai = new Qingcai()
    
    println(aaQingcai.aaMengka(bbQingcai))
    println(aaQingcai.getaaString)
    
     println(bbQingcai.getaaString)
     println(bbQingcai.bb)
  }

}