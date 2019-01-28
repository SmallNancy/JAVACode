package cn.nancy.Singleton;
/**
 * 饿汉式单例模式
 * 线程安全，效率高，不能延迟加载
 * @author Small
 *
 */
public class Singleton01 {
  private static Singleton01 single = new Singleton01();  // 对象私有化
  
  private Singleton01() {                                 // 构造器私有
  	
  }
  
  public static Singleton01 instance() {                  // 全局访问点共有
  	return single;
  }
}
