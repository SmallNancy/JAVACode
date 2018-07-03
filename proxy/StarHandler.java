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
		System.out.println("真正方法执行前");
		System.out.println("签合同");
		if(method.getName().equals("sing")) {
			obj = method.invoke(RealStar, args);
		}
		System.out.println("真正方法执行后");
		System.out.println("收钱，走人");
		return null;
	}

}
