package mengka.trait_04

/**
 *
 * User: mengka.hyy
 * Date: 14-8-31-обнГ2:38
 */
trait BasketBall extends Ball {

  override def play():String = {
    "play basketBall.." + super.play()
  }
}
