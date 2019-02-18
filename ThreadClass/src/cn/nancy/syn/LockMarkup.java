package cn.nancy.syn;
/**
 * 模拟死锁的产生
 * @author Nancy
 *
 */
public class LockMarkup {
  public static void main(String[] args) {
		MarkupTest t = new MarkupTest(1, "天");
		MarkupTest t1 = new MarkupTest(0, "琪");
		new Thread(t).start();
		new Thread(t1).start();
	}
}

class Lipstick{
	
}

class Mirror{
	
}

class MarkupTest implements Runnable{
	//static 静态，代表每次只有一个
	static Lipstick lpis = new Lipstick();
	static Mirror mirror = new Mirror();
	int choice;
	String name;
	
	public MarkupTest(int choice, String name) {
		super();
		this.choice = choice;
		this.name = name;
	}

	@Override
	public void run() {
		mark();
	}
	private void mark() {
		if(choice == 1) {
			synchronized(lpis) {
				System.out.println(name + "获得口红");
				try {
					Thread.sleep((int)(1000*Math.random()));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(mirror) {
					System.out.println(name + "获得镜子，开始化妆");
				}
			}
		}else {
			synchronized(mirror) {
				System.out.println(name + "获得镜子");
				try {
					Thread.sleep((int)(2000 * Math.random()));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lpis) {
					System.out.println(name + "获得口红，开始化妆");
				}
			}
		}
	}
}
