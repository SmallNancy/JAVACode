package cn.nancy.QuartzDemo;
/**
 * volatile ��֤���߳�����ͬ��
 * �����Ƚ�С
 * ��������synchronized
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
