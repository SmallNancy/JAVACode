package cn.nancy.syn;

import java.util.Date;

public class PhilosopherProblem {
  public static void main(String[] args) {
		Chopstick c1 = new Chopstick();
		Chopstick c2 = new Chopstick();
		Chopstick c3 = new Chopstick();
		Chopstick c4 = new Chopstick();
		Chopstick c5 = new Chopstick();
		
		Philosopher p1 = new Philosopher("1",c5,c1);
		Philosopher p2 = new Philosopher("2",c1,c2);
		Philosopher p3 = new Philosopher("3",c2,c3);
		Philosopher p4 = new Philosopher("4",c3,c4);
		Philosopher p5 = new Philosopher("5",c4,c5);
		Date time = new Date(System.currentTimeMillis());
		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
		new Thread(p4).start();
		new Thread(p5).start();
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(p1.rice == 0 && p2.rice == 0 && p3.rice == 0 && p4.rice == 0 && p5.rice == 0) {
			Date time2 = new Date(System.currentTimeMillis());
			System.out.println(time2.getTime()-time.getTime());
			break;
		}
		}
	}
}


// 筷子类
class Chopstick{
	boolean isTake;
	public void take() {
		isTake = true;
	}
	public void put() {
		isTake = false;
	}
}
// 哲学家
class Philosopher implements Runnable{
	String name;
	Chopstick left;
	Chopstick right;
	boolean isGetLeft;
	boolean isGetRight;
	boolean eatFlag;
	final int defaultRice = 3;
	int rice = defaultRice;
	int maxSleepTime = 1000;
	public Philosopher(String name,Chopstick left,Chopstick right) {
		this.name = name;
		this.left = left;
		this.right = right;
	}
	public void eat() {
		rice--;
		left.put();
		right.put();
		isGetLeft = false;
		isGetRight = false;
	}
	public void run() {
		int temp;
		int sleepTime = 0;
		while(true) {
			if(rice==0) {
				return;
			}

			int num = 0;
			if(isGetLeft) {
				num++;
			}
			if(isGetRight) {
				num++;
			}

			try {
				temp = (int)(200*Math.random());
				Thread.sleep(200);
				sleepTime += temp;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!isGetLeft&&left.isTake==false) {
				left.take();
				isGetLeft = true;
			}
			try {
				temp = (int)(200*Math.random());
				Thread.sleep(temp);
				sleepTime += temp;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!isGetRight&&right.isTake==false) {
				right.take();
				isGetRight = true;
			}
			try {
				temp = (int)(200*Math.random());
				Thread.sleep(temp);
				sleepTime += temp;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(sleepTime > maxSleepTime) {
				if(isGetRight) {
					right.put();
					isGetRight = false;
				}
				if(isGetLeft) {
					left.put();
					isGetLeft = false;
				}
				sleepTime = 0;
			}
			if(isGetLeft&&isGetRight) {
				eat();
			}
			System.out.println("哲学家"+name+"号"+"有筷子"+num+"个,他面前的饭还有"+rice+"口");
		}
	}
}


