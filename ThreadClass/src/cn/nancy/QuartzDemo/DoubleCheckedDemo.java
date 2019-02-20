package cn.nancy.QuartzDemo;
/**
 * DCL����ģʽ  ���̱߳���ָ������volatile
 * @author Nancy
 *
 */
public class DoubleCheckedDemo {
	
	//˽�о�̬�ı���
	private volatile static DoubleCheckedDemo instance;
	
	//������˽�л�
	private DoubleCheckedDemo() {
		
	}
	
	//��̬�Ĺ�������
	public static DoubleCheckedDemo getInstance() {
		
		//�������
		if(null != instance) {
			return instance;
		}
		synchronized (DoubleCheckedDemo.class) {
			if(instance == null) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				instance = new DoubleCheckedDemo();
			}
			return instance;
		}
	}
	
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println(DoubleCheckedDemo.getInstance());
		}).start();
		System.out.println(DoubleCheckedDemo.getInstance());
	}

}
