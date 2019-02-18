package cn.nancy.syn;
/**
 *  test 线程安全
 *  synchronized 锁的不是类，是this对象
 * @author Nancy
 *
 */
public class SafeTest {
	public static void main(String[] args) {
		Safe12306 web = new Safe12306();
		new Thread(web,"码农").start();
		new Thread(web,"工程师").start();
		new Thread(web,"架构师").start();
	}

}

class  Safe12306 implements Runnable{
  private int ticketNums = 100;
  private boolean flag = true;
	@Override
	public void run() {
		while(flag) {
			test();
			try {
			  Thread.sleep(50);
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			  e.printStackTrace();
		    }
		}
	}
	public synchronized void test() {
		if(ticketNums <= 0) {
			flag = false;
			return;
		}
	  try {
		  Thread.sleep(50);
	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		  e.printStackTrace();
	    }
	    System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
	}
	
}