package mengka.trait_03

/**
 *
 * User: mengka.hyy
 * Date: 14-6-15-����5:09
 */
trait Qingcai extends Cai{

  /**
   *  super.planted()�����ǵ��ø���ķ��������Ƕ���߻����trait�ĵ��ã�
   *
   * @return
   */
  override def planted():String = "qingcai AAA.."+super.planted()
}
