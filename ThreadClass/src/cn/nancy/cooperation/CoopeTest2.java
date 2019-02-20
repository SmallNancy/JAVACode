package cn.nancy.cooperation;
/**
 * ������������ģʽ���źŵƷ�
 * ������־λ
 * @author Nancy
 *
 */
public class CoopeTest2 {
  public static void main(String[] args) {
  	Light light = new Light();
  	new Police(light).start();
  	new Pedestrian(light).start();
	}
}

//������ -->����
class Police extends Thread{
	Light light;
	public Police(Light light) {
		this.light = light;
	}

	@Override
	public void run() {
		for(int i = 0;i < 10;i++) {
			if(i % 2 == 0) {
				System.out.println("���찴�����");
				light.redLight("���");
			}else {
				System.out.println("����Ϩ����");
			}
		}
	}
}
//������ -->����
class Pedestrian extends Thread{
	Light light;
	public Pedestrian(Light light) {
		this.light = light;
	}
	@Override
	public void run() {
		System.out.println("ע�⵽����");
		light.Pass();
	}
}

//ͬһ����Դ
class Light{
	String name;
	//�źŵ� T ����������˵ȴ�
	//F �Ƶȴ���������
	boolean flag = false;
	
	//��Ա����
	public synchronized void redLight(String name) {
		if(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name = name;
		System.out.println(name + "����");
		this.notifyAll();
		this.flag = !flag;
	}
	
	//����
	public synchronized void Pass() {
		if(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("��һ��");
		this.notifyAll();
		this.flag = !flag;
	}
}
