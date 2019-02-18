package cn.nancy.syn;

import java.util.ArrayList;
import java.util.List;
/**
 * case:�̲߳���ȫ����������
 * @author Nancy
 *
 */
public class SynList {
	public static void main(String[] args) throws Exception {
		List<String> list = new ArrayList<String>();
		for(int i = 0;i < 10000;i++) {
			new Thread(()->{
				synchronized(list)
				{				
					list.add(Thread.currentThread().getName());
				}
			}).start();
		}
		Thread.sleep(100);
		System.out.println(list.size());
	}

}
