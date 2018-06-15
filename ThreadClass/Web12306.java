package cn.nancy.threadCreate;

public class Web12306 implements Runnable {
	private int num = 50;
	public void run() {
		while(true) {
			if (num <=0) {
				break;
			}
			System.out.println(Thread.currentThread().getName()+"ÇÀµ½"+num--);
		}
	}
	public static void main(String[] args) {
		Web12306 web = new Web12306();
		Thread t1 = new Thread(web,"ÖìÃÎÌì");
		Thread t2 = new Thread(web,"½ðÑàç÷");
		Thread t3 = new Thread(web,"Ê·ÍåÍå");
		Thread t4 = new Thread(web,"Ð¡ÖíÖí");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
