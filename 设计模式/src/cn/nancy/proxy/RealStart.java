package cn.nancy.proxy;

public class RealStart implements Start{

	@Override
	public void Confer() {
		System.out.println("realStart 商谈");
	}

	@Override
	public void Sing() {
		System.out.println("realStart--周杰伦-- 唱歌");
	}

	@Override
	public void End() {
		System.out.println("realStart 结束");
	}

}
