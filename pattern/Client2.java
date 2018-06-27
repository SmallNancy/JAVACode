package singleton;

import java.lang.reflect.Constructor;

/**
 * 测试反射和反序列
 * @author small
 *
 */
public class Client2 {
    public static void main(String[] args) throws Exception {
		SingleDemo5 s1 = SingleDemo5.getInstance();
		SingleDemo5 s2 = SingleDemo5.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		Class<SingleDemo5> clazz = (Class<SingleDemo5>)Class.forName("singleton.SingleDemo5");
		Constructor<SingleDemo5> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		System.out.println("--------------------------");
	
		System.out.println("---------------------------");
		System.out.println(SingleDemo4.INSTANCE ==SingleDemo4.INSTANCE);
		
		
		
	}
}
