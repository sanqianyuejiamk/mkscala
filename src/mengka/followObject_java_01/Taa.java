package mengka.followObject_java_01;

/**
 * 
 *  调用伴生对象的方法的时候，使用：Baicai$.MODULE$.xxx();
 * 
 * @author hyy044101331
 *
 */
public class Taa{
	
	public static void main(String[] args){
		
		/**
		 *  java调用伴生类方法
		 */
		new Mengka().planted();
		
	    /**
	     * java调用伴生对象方法
	     */
		Mengka$.MODULE$.planted();
	}
}