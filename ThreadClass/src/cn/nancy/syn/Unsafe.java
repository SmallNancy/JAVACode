package cn.nancy.syn;
/**
 *  test �̲߳���ȫ ������ͬ��Ʊ���͸���
 * @author Nancy
 *
 */
public class Unsafe {
	public static void main(String[] args) {
		unSafe12306 web = new unSafe12306();
		new Thread(web,"��ũ").start();
		new Thread(web,"����ʦ").start();
		new Thread(web,"�ܹ�ʦ").start();
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