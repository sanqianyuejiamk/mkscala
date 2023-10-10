package mengka.actor_01

import scala.actors._

/**
 *
 * User: mengka.hyy
 * Date: 14-7-12-ÉÏÎç11:42
 */
class MengkaService(val baicai: String*) extends Actor {


  val TEXT_1 = "baicai contains name , name = %s , message = %s"
  val TEXT_2 = "baicai not contains name , name = %s , message = %s"

  def act() {

    while (true) {
      receive {
        case (caller: Actor, name: String, message: String) =>
          caller ! (
            if (baicai.contains(name)) {
              val kk = String.format(TEXT_1, name, message)
              kk
            } else {
              val kk = String.format(TEXT_2, name, message)
              kk
            }
            )
        case "ping" => println("ping..")
        case "quit" => println("quit..")
          exit//ÍË³öactor
      }
    }
  }

  def restartMengka(): Actor = synchronized {
    println("*******restart mengkaService*******")
    this.start()
    this
  }

}
