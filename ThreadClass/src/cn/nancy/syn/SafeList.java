package cn.nancy.syn;

import java.util.concurrent.CopyOnWriteArrayList;
/**
 * List����ʹ��arryList�̲߳���ȫ
 *      ʹ�ò������� ��ʵ������ͬ��
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
