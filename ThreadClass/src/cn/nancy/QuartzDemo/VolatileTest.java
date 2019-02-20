package cn.nancy.QuartzDemo;
/**
 * volatile 保证多线程数据同步
 * 开销比较小
 * 轻量级的synchronized
 * @author Nancy
 *
 */
public class VolatileTest {
	private volatile static int num = 0;
   public static void main(String[] args) throws Exception {
	 new Thread(()->{
		 while(num == 0) {
			 
		 }
	 }) .start();
		Thread.sleep(1000);
		num = 1;
	}
}
