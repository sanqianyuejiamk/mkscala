package mengka.baicai


/**
 *   scala���ԡ��Զ����ݡ������صķ���������
 * 
 */
object return_01 {

   def main(args:Array[String]):Unit = {
     
     /**  
      *   scala�Դ��ġ��Զ����ݡ�������
      */
     def f1() = true 
     println(f1)
     
     
     /**
      *      ��ע������ʽָ�����ͣ��ͻ��б������
      *  �����return�ƻ�scala�ġ��Զ����ݡ����ͻ��ƣ�
      *          
      *             ��ʱ����Ҫ�Լ��ġ���ʽָ���������͡�
      */
     def f2():Boolean = return true
     println(f2)
     
     
   }
}