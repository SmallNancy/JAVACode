package cn.nancy.cooperation;
/**
 * 生产者消费者模式：信号灯法
 * 借助标志位
 * @author Nancy
 *
 */
public class CoopeTest2 {
  public static void main(String[] args) {
  	Light light = new Light();
  	new Police(light).start();
  	new Pedestrian(light).start();
	}
}

//生产者 -->警察
class Police extends Thread{
	Light light;
	public Police(Light light) {
		this.light = light;
	}

	@Override
	public void run() {
		for(int i = 0;i < 10;i++) {
			if(i % 2 == 0) {
				System.out.println("警察按量红灯");
				light.redLight("红灯");
			}else {
				System.out.println("警察熄灭红灯");
			}
		}
	}
}
//消费者 -->行人
class Pedestrian extends Thread{
	Light light;
	public Pedestrian(Light light) {
		this.light = light;
	}
	@Override
	public void run() {
		System.out.println("注意到灯亮");
		light.Pass();
	}
}

//同一份资源
class Light{
	String name;
	//信号灯 T 红灯亮，行人等待
	//F 灯等待，人行走
	boolean flag = false;
	
	//演员表演
	public synchronized void redLight(String name) {
		if(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name = name;
		System.out.println(name + "亮了");
		this.notifyAll();
		this.flag = !flag;
	}
	
	//观众
	public synchronized void Pass() {
		if(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("等一等");
		this.notifyAll();
		this.flag = !flag;
	}
}
