package cn.nancy.threadCreate;
/**
 * ʹ��Runnable�ӿ�
 * 1.��  ʵ��Runnable �ӿ�  ��дrun����
 * 2. �������߳� ʹ�þ�̬����
 *    1��������ʵ��ɫ
 *    2�����������ɫ+��ʵ��ɫ����
 *    3������start����  �����߳�
 * @author Small
 *
 */
public class Programmer implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++) {
			System.out.println("һ���ô���");
		}
	}

}
