package cn.nancy.proxy;

public class ProxyPerson implements Start{

	private Start start;
	
	public ProxyPerson(Start start) {
		super();
		this.start = start;
	}

	@Override
	public void Confer() {
		System.out.println("proxy  ---交谈");
	}

	@Override
	public void Sing() {
		start.Sing();
	}

	@Override
	public void End() {
		System.out.println("proxy  ---演唱会结束");
	}

}
