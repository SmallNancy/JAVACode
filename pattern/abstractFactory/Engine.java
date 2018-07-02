package abstractFactory;

public interface Engine {
    void run();
    void start();
}

class LuxuryEngine implements Engine{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ת�Ŀ�");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("�����죬�����Զ���ͣ");
	}
	
}

class LowEngine implements Engine{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ת����");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	
}