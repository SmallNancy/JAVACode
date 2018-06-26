package testJavassist;

import java.util.Arrays;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

/**
 * 测试javassist的API
 *
 */
public class Demo02 {
	/**
	 * 处理类的基本用法
	 * @throws Exception 
	 */
	public static void test01() throws Exception {
		ClassPool pool = ClassPool.getDefault();//返回默认的ClassPool，单例模式！
		CtClass cc = pool.get("testjavassist.Emp");
		byte[] bytes = cc.toBytecode();
		System.out.println(Arrays.toString(bytes));
		System.out.println(cc.getName());//获取类名
		System.out.println(cc.getSimpleName());//获取简要类名
		System.out.println(cc.getInterfaces());//获得接口
	}
	public static void main(String[] args) throws Exception {
		test01();
	}

}

