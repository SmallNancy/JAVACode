package singleton;
/**
 * 测试饿汉式单例模式
 * 加载类时，天然的线程安全
 * @author small
 *
 */
public class SingleDemo {
	//提供静态属性,类初始化时，立即加载此对象
	 private static SingleDemo instance = new SingleDemo();
    //私有构造器
	 private SingleDemo() {
		 
	 }
	 //方法没有同步，调用效率高
	 public static SingleDemo getInstance() {
		 return instance;
	 }
}
