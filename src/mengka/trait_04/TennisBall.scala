package mengka.trait_04

/**
 *
 * User: mengka.hyy
 * Date: 14-8-31-����2:42
 */
trait TennisBall extends Ball {

  override def play():String = {
    "play tennisBall.." + super.play()
  }
}
