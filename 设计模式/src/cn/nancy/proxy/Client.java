package cn.nancy.proxy;

public class Client {
	public static void main(String[] args) {
		RealStart start = new RealStart();
		ProxyPerson oxy = new ProxyPerson(start);
		oxy.Confer();
		oxy.Sing();
		oxy.End();
	}

}
