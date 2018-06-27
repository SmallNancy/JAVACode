package singleton;
/**
 * 测试静态内部类实现方式的单例模式
 * 加载类时，天然的线程安全,调用效率高，也延迟加载
 * 最优
 * @author small
 *
 */
public class SingleDemo3 {
	private static class SingletonClassInstance{
		 private static final SingleDemo3 instance = new SingleDemo3();
	}
	
    //私有构造器
	 private SingleDemo3() {
		 
	 }
	 //方法没有同步，调用效率高，延迟加载
	 public static SingleDemo3 getInstance() {
		 return SingletonClassInstance.instance;
	 }
}
