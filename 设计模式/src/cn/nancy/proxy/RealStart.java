package cn.nancy.proxy;

public class RealStart implements Start{

	@Override
	public void Confer() {
		System.out.println("realStart ��̸");
	}

	@Override
	public void Sing() {
		System.out.println("realStart--�ܽ���-- ����");
	}

	@Override
	public void End() {
		System.out.println("realStart ����");
	}

}
