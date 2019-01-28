package cn.nancy.Singleton;
/**
 * 静态内部类实现方式--单例
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
