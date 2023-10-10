package mengka.trait_04

/**
 *  trait的横向开发
 *
 *  从最右边的trait顺序向左边执行，最后执行混入这个trait的类的方法：
 *   TennisBall.play()
 *   FootBall.play()
 *   BasketBall.play()
 *   Ball.play()
 */
/**
 *
 * User: mengka.hyy
 * Date: 14-8-31-下午2:43
 */
object Taa {

  def main(args: Array[String]): Unit = {

    val ball1 = new Ball with BasketBall with FootBall with TennisBall
    println(ball1.play())

    val ball2 = new Ball with FootBall with TennisBall
    println(ball2.play())

  }
}
