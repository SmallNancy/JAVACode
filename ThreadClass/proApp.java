package cn.nancy.threadCreate;

public class proApp {
	public static void main(String[] args) {
//		1��������ʵ��ɫ
		Programmer pro = new Programmer();
//		2�����������ɫ+��ʵ��ɫ����
		Thread proxy = new Thread(pro);
//		3������start����  �����߳�
		proxy.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("һ�߿���Ƶ----");
		}
	}

}
