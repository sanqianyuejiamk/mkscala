package mengka.followObject_02

object A{
  def main(args: Array[String]): Unit = {

    //伴生对象里面的变量（类似java里面的static变量）
    println(Baicai.mengka)

    //Baicai（"aa"）其实调用的是，Baicai.apply("aa")
    println(Baicai("aa"))

  }

}