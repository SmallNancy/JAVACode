package testJavassist;

import java.util.Arrays;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

/**
 * ����javassist��API
 *
 */
public class Demo02 {
	/**
	 * ������Ļ����÷�
	 * @throws Exception 
	 */
	public static void test01() throws Exception {
		ClassPool pool = ClassPool.getDefault();//����Ĭ�ϵ�ClassPool������ģʽ��
		CtClass cc = pool.get("testjavassist.Emp");
		byte[] bytes = cc.toBytecode();
		System.out.println(Arrays.toString(bytes));
		System.out.println(cc.getName());//��ȡ����
		System.out.println(cc.getSimpleName());//��ȡ��Ҫ����
		System.out.println(cc.getInterfaces());//��ýӿ�
	}
	public static void main(String[] args) throws Exception {
		test01();
	}

}

