package cn.nancy.QuartzDemo;
/**
 * ThreadLocal ����������
 * ���������������������
 * @author Nancy
 *
 */
public class ThreadLocalTest2 {
  private static ThreadLocal<Integer> thr = ThreadLocal.withInitial(()->100);
  public static void main(String[] args) {
		new Thread(new myTh()).start();
		new Thread(new myTh()).start();
	}
  public static class myTh extends Thread{
  	public myTh() {
  		thr.set(33);
  		System.out.println(Thread.currentThread().getName() + "==" + thr.get());
  	}
  	@Override
  	public void run() {
  		System.out.println(Thread.currentThread().getName() + "==" + thr.get());
  	}
  }
}
