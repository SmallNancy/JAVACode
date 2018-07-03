package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{
    Star RealStar;
	public StarHandler(Star realStar) {
		super();
		RealStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = null;
		System.out.println("��������ִ��ǰ");
		System.out.println("ǩ��ͬ");
		if(method.getName().equals("sing")) {
			obj = method.invoke(RealStar, args);
		}
		System.out.println("��������ִ�к�");
		System.out.println("��Ǯ������");
		return null;
	}

}
