package singleton;
/**
 * ��������ʽ����ģʽ(��η�ֹ����ͷ����л�)
 * @author small
 *
 */
public class SingleDemo2 {
	 private static SingleDemo2 instance;
    //˽�й�����
	 private SingleDemo2() {
		 
	 }
	 //������Ҫ synchronizedͬ��������Ч�ʵ�
	 public static synchronized SingleDemo2 getInstance() {
		 if(instance==null) {
			 instance = new SingleDemo2();
		 }
		 return instance;
	 }
}
