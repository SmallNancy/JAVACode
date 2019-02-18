package cn.nancy.syn;
/**
 *  test 线程不安全 出现相同的票数和负数
 * @author Nancy
 *
 */
public class Unsafe {
	public static void main(String[] args) {
		unSafe12306 web = new unSafe12306();
		new Thread(web,"码农").start();
		new Thread(web,"工程师").start();
		new Thread(web,"架构师").start();
	}

}

class  unSafe12306 implements Runnable{
  private int ticketNums = 100;
  private boolean flag = true;
	@Override
	public void run() {
		while(flag) {
			test();
		}
	}
	public void test() {
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