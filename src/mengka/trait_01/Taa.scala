package mengka.trait_01

/**
 *
 * User: mengka.hyy
 * Date: 14-6-15-下午3:39
 */
object Taa {

     def main(args:Array[String]):Unit = {

       /**
        *  例一：
        *      抽象类的使用
        *
        * @return
        */
       def baicai = new Baicai("白菜")
       println(baicai.plantedCai)
       println(baicai.mengka)

       println(baicai.baicai())
     }
}
