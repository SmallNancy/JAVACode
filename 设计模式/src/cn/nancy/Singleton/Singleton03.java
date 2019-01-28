package cn.nancy.Singleton;
/**
 * ��̬�ڲ���ʵ�ַ�ʽ--����
 * @author Small
 *
 */
public class Singleton03 {
  private static class SingletonInstance{
  	private static final Singleton03 instance = new Singleton03();
  }
  
  private Singleton03() {
  	
  }
  public static Singleton03 getInstance() {
  	return SingletonInstance.instance;
  }
}
