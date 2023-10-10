package mengka.baicai


/**
  * Created by xiafeng 
  * on 16-2-14.
  */
object for_03 {

  def main(args: Array[String]) {

    /**
      *  返回一个（1，10）所有数乘以2以后的集合
      *
      */
    val result = for(i <- 1 to 10)
      yield i*2

    println(String.format("------------, result = %s , size = %s":String,result.toString():String,String.valueOf(result.size):String))

    result.foreach{
      tmp => println(" "+tmp)
    }
  }
}
