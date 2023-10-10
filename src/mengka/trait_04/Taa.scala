package mengka.trait_04

/**
 *  trait�ĺ��򿪷�
 *
 *  �����ұߵ�trait˳�������ִ�У����ִ�л������trait����ķ�����
 *   TennisBall.play()
 *   FootBall.play()
 *   BasketBall.play()
 *   Ball.play()
 */
/**
 *
 * User: mengka.hyy
 * Date: 14-8-31-����2:43
 */
object Taa {

  def main(args: Array[String]): Unit = {

    val ball1 = new Ball with BasketBall with FootBall with TennisBall
    println(ball1.play())

    val ball2 = new Ball with FootBall with TennisBall
    println(ball2.play())

  }
}
