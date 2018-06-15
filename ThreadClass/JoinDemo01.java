package cn.nancy.ThreadStatus;
/**
 * join：合并线程
 * @author Small
 *
 */
public class JoinDemo01 extends Thread{
	public static void main(String[] args) throws InterruptedException {
		JoinDemo01 demo01 = new JoinDemo01();
		Thread t = new Thread(demo01);
		t.start();
		for(int i =0;i<100;i++) {
			if(50==i) {
			t.join();	
			}
			System.out.println("main....."+i);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0;i<100;i++) {
			System.out.println("join ....."+i);
		}
	}

}
