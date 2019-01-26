package cn.nancy.test;
/**
 *    测试包装类
 * @author Small
 *
 */
public class WrappedClass {
  public static void main(String[] args) {
		//1、基本数据类型转换成包装类
  	Integer a = new Integer(20);
  	Integer aa = Integer.valueOf(10);
  	//2、包装类转换成基本数据
  	int c = a.intValue();
  	double d = aa.doubleValue();
  	//3、字符串转成包装类对象
  	Integer f = Integer.parseInt("999");
  	//4、包装类转换成字符串
  	String str = f.toString();
  	
  	
  	Integer age = 13; //Integer a = Integer.valueof(13);自动装箱
  	
  	Integer a1 = 127;
  	Integer a2 = 127;
  	System.out.println(a1 == a2);
  	System.out.println(a1.equals(a2));
  	System.out.println("127===================");
  	Integer b1 = 128;
  	Integer b2 = 128;
  	System.out.println(b1 == b2);
  	System.out.println(b1.equals(b2));
  	System.out.println("128===================");
	}
}
