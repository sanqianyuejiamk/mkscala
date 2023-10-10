package mengka.followObject_02

class Baicai private(val kk:String){
  println("create "+this)

  override def toString():String = "baicai AAA: "+ kk
}

/**
 *   �������ʵ������Ҫ���³�ʼ��������Ҫnew
 *
 *      ���Գ��������ڣ������ݿ���ʣ��ڶ��󹤳���֮��Ĳ���
 */
object Baicai{

  private val aaMap = Map(
    "aa" -> new Baicai("�ײ�"),
    "bb" -> new Baicai("���"),
    "cc" -> new Baicai("����"))


  def mengka = "����scala�����statis������"

  /*
   *  scala�����apply(),�﷨���÷���
   *      1. �������ʵ��������Ҫnew;
   *      2. Baicai��"aa"����ʵ���õ��ǣ�Baicai.apply("aa");
   *      3. ��������⿪�ŵ�{aa,bb,cc}���ڰ����������涼�Ѿ��������ˣ����Ը������˹���;
   */
  def apply(kk:String) = if (aaMap.contains(kk)) aaMap(kk) else null
}