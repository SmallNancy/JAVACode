package cn.nancy.test;

public class ThreadTest1 extends Thread{
  @Override
  public void run() {
  	//run�����߳������ڵ�
	 for(int i = 0;i < 10;i++) {
		 System.out.println(i + "����");
	 }
  }
  public static void main(String[] args) {
		ThreadTest1 th = new ThreadTest1();
		th.start();                        //cpu���ȣ�������ִ��
		for(int i = 0;i < 10;i++) {
			 System.out.println(i + "ѧϰ");
		 }
	}
}
