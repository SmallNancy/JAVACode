package cn.nancy.threadCreate;
/**
 * 模拟龟兔赛跑
 * 1. 创建多线程 继承thread +重写run方法 
 * 2. 使用线程: 创建子类对象 +对象.start()+
 * @author Small
 *
 */
public class Rabbit extends Thread{
	//重写run方法
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		//线程体
		for(int i =0;i<100;i++) {
			System.out.println("兔子跑了"+i+"步！");
		}
	}

}
class Tortoise extends Thread{

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0;i<100;i++) {
			System.out.println("乌龟跑了"+i+"步！");
		}
	}
	
}
