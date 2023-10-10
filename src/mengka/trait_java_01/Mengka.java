package mengka.trait_java_01;

/**
 *
 *   如果trait里面的方法都是抽象的方法话，java中就能跟接口一样，implements直接使用这个trait定义的接口
 *
 * User: mengka.hyy
 * Date: 14-8-23-下午9:26
 */
public class Mengka implements Cai {

    @Override
    public void planted(String aa) {
       System.out.println(aa+" , baicai AAA...");
    }

    public static void main(String[] args){
        new Mengka().planted("mengka");
    }
}
