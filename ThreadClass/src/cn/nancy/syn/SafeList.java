package cn.nancy.syn;

import java.util.concurrent.CopyOnWriteArrayList;
/**
 * List容器使用arryList线程不安全
 *      使用并发容器 ，实现容器同步
 * @author Nancy
 *
 */
public class SafeList {
  public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		for(int i = 0;i < 1000;i++) {
			list.add(Thread.currentThread().getName());
		}
		System.out.println(list.size());
	}
}
