package singleton;
/**
 * ��������ʽ����ģʽ
 * @author small
 *
 */
public class SingleDemo5 {
	 private static SingleDemo5 instance;
    //˽�й�����
	 private SingleDemo5() {
		 if(instance!=null) {
			 throw new RuntimeException();
		 }
	 }
	 //������Ҫ synchronizedͬ��������Ч�ʵ�
	 public static synchronized SingleDemo5 getInstance() {
		 if(instance==null) {
			 instance = new SingleDemo5();
		 }
		 return instance;
	 }
}
