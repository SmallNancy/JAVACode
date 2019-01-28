package cn.nancy.Singleton;
/**
 *  ����ʽ����ģʽ
 * @author Small
 *
 */
public class Singleton02 {
  private static Singleton02 instance; // ����ʼ�������õ�ʱ�򴴽�
  private Singleton02() {  // ˽�л����췽��
  	
  }
  
  // synchronized �̲߳���ȫ����Ҫͬ�� ����Ч�ʵ�
  public static synchronized Singleton02 getInstance() {
  	if(instance == null) {
  		instance = new Singleton02();
  	}
  	return instance;
  }
}
