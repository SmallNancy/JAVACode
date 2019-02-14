package cn.nancy.test;

import java.lang.Thread.State;
/**
 * 查看线程状态
 * @author Nancy
 *
 */
public class BlockSleep {
	public static void main(String[] args) throws Exception{
		
		Thread td = new Thread(()->{
			for(int i = 0;i < 5;i++)
			System.out.println("....." + i);
		});
		State state = td.getState(); 
		System.out.println(state + "1");
		td.start();
		state = td.getState();
		System.out.println(state + "2");
		while(state != Thread.State.TERMINATED) {
			Thread.sleep(400);
			state = td.getState();
			System.out.println(state + "3");
		}
		state = td.getState();
		System.out.println(state + "4");
	}
/**
 * 倒计时
 * @throws Exception
 */
public static void countDown() throws Exception{
		int n = 10;
		while(n >= 0) {
			Thread.sleep(1000);
			System.out.println(n--);
		}
	}
}
