package cn.nancy.threadCreate;
/**
 * ģ���������
 * 1. �������߳� �̳�thread +��дrun���� 
 * 2. ʹ���߳�: ����������� +����.start()+
 * @author Small
 *
 */
public class Rabbit extends Thread{
	//��дrun����
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		//�߳���
		for(int i =0;i<100;i++) {
			System.out.println("��������"+i+"����");
		}
	}

}
class Tortoise extends Thread{

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0;i<100;i++) {
			System.out.println("�ڹ�����"+i+"����");
		}
	}
	
}
