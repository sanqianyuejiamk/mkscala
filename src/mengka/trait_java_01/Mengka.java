package mengka.trait_java_01;

/**
 *
 *   ���trait����ķ������ǳ���ķ�������java�о��ܸ��ӿ�һ����implementsֱ��ʹ�����trait����Ľӿ�
 *
 * User: mengka.hyy
 * Date: 14-8-23-����9:26
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
