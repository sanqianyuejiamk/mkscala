package mengka.object_01

/**
 * ��object��������һ�����ӡ�
 * 
 *  object,�������������ʱ��ʹ�ã�
 *
 * ���������ܳ�ʼ�������Բ��ܸ����ǵ������캯�����ݲ�����
 *
 *
 */
object object_01 {

  class Market(val kk:String){
    
    println("����ʼ��"+kk+"������AAA: "+this)
    
    override def toString():String = "����ӡ����Market AAA:"+kk
  }
  
  
  /**
   *  ��������
   *   1. �޷���ʼ��;
   *   2. �����캯���޷����ݲ���;
   */
  object Baicai{
    
    private val aaMap = Map(
    	"red" -> new Market("��ɫAAA"),
    	"blue" -> new Market("��ɫAAA"),
    	"green" -> new Market("��ɫAAA")
    )
    
    def getBaicai(kk:String){
      if(aaMap.contains(kk)){
        println("BBB"+aaMap.get(kk).toString())
      }
    }
    
  }
  
  
  
  def main(args: Array[String]): Unit = {
		  
     println(Baicai getBaicai "blue")
  }
}