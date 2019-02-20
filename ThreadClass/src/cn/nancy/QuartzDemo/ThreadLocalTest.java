package cn.nancy.QuartzDemo;
/**
 * ThreadLocal ÿһ���߳�����Ĵ洢���ء��ֲ��ռ�
 * ÿһ���̶߳����Լ������򣬲���Ӱ�������߳�
 * @author Nancy
 *
 */
public class ThreadLocalTest {
  //private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
	
	  private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){ 
	  	protected Integer initialValue() {
	  		return 300; 
	  	}; 
	  };
	 
	//private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(()->{
	//	return 199;
	//});
  
  public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "==" + threadLocal.get());
		threadLocal.set(99);
		System.out.println(Thread.currentThread().getName() + "==" + threadLocal.get());
		new Thread(new myThead()).start();
		new Thread(new myThead()).start();
	}
  
  public static class myThead extends Thread{
  	@Override
  	public void run() {
  		threadLocal.set((int)(Math.random() * 99));
  		System.out.println(Thread.currentThread().getName() +"==" + threadLocal.get());
  	}
  }
}


