package cn.nancy.ThreadStatus;
/**
 * 暂停本方法内的线程
 * Thread.yield();
 * @author Small
 *
 */
public class YieldDemo extends Thread{
	public static void main(String[] args) {
		YieldDemo demo = new YieldDemo();
		Thread t = new Thread(demo);
		t.start();
		for(int i =0;i<100;i++) {
			if (i%20==0) {
				//暂停本线程main
				Thread.yield();
			}
			System.out.println("main ....."+i);
		}
	}

	@Override
	public void run() {
		super.run();
		for(int i =0;i<100;i++) {
			System.out.println("yield ....."+i);
		}
	}
	
}
