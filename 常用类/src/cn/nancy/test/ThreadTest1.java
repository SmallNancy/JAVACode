package cn.nancy.test;

public class ThreadTest1 extends Thread{
  @Override
  public void run() {
  	//run方法线程体的入口点
	 for(int i = 0;i < 10;i++) {
		 System.out.println(i + "唱歌");
	 }
  }
  public static void main(String[] args) {
		ThreadTest1 th = new ThreadTest1();
		th.start();                        //cpu调度，不立即执行
		for(int i = 0;i < 10;i++) {
			 System.out.println(i + "学习");
		 }
	}
}
