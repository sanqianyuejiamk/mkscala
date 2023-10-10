package mengka.trait_04

/**
 *
 * User: mengka.hyy
 * Date: 14-8-31-обнГ2:40
 */
trait FootBall extends Ball {

  override def play():String = {
    "play footBall.." + super.play()
  }
}
