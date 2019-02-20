package cn.nancy.QuartzDemo;
/**
 * DCL单例模式  多线程避免指令重排volatile
 * @author Nancy
 *
 */
public class DoubleCheckedDemo {
	
	//私有静态的变量
	private volatile static DoubleCheckedDemo instance;
	
	//构造器私有化
	private DoubleCheckedDemo() {
		
	}
	
	//静态的公共方法
	public static DoubleCheckedDemo getInstance() {
		
		//提高性能
		if(null != instance) {
			return instance;
		}
		synchronized (DoubleCheckedDemo.class) {
			if(instance == null) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				instance = new DoubleCheckedDemo();
			}
			return instance;
		}
	}
	
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println(DoubleCheckedDemo.getInstance());
		}).start();
		System.out.println(DoubleCheckedDemo.getInstance());
	}

}
