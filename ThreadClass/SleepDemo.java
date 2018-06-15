package cn.nancy.ThreadStatus;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1. 2秒打印一个
 * 2. 倒计时
 * @author Small
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		test();
		Date endTime = new Date(System.currentTimeMillis()+10*1000);
		long end = endTime.getTime();
		while(true) {
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			endTime = new Date(endTime.getTime()-1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (end-1000>endTime.getTime()) {
				break;
			}
		}
	}
	public static void test() {
		int num = 10;
		while(true) {
			System.out.println(num--);
			try {
				Thread.sleep(2000);//暂停2s
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (num<=0) {
				break;
			}
		}
	}
}
