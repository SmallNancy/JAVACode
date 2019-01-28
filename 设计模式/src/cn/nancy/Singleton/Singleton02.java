package cn.nancy.Singleton;
/**
 *  懒汉式单例模式
 * @author Small
 *
 */
public class Singleton02 {
  private static Singleton02 instance; // 不初始化对象，用的时候创建
  private Singleton02() {  // 私有化构造方法
  	
  }
  
  // synchronized 线程不安全，需要同步 并发效率低
  public static synchronized Singleton02 getInstance() {
  	if(instance == null) {
  		instance = new Singleton02();
  	}
  	return instance;
  }
}
