package dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		Star real = new RealStar();
		StarHandler handle = new StarHandler(real);
		Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class<?>[]{Star.class}, handle);
		proxy.sing();
	}

}
