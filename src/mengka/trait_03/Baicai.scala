package mengka.trait_03

/**
 *
 * User: mengka.hyy
 * Date: 14-6-15-����5:07
 */
trait Baicai extends Cai{

  /**
   *  super.planted()�����ǵ��ø���ķ��������Ƕ���߻����trait�ĵ��ã�
   *
   * @return
   */
  override def planted():String = "baicai AAA.."+super.planted()
}
