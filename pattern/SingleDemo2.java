package singleton;
/**
 * 测试懒汉式单例模式(如何防止反射和反序列化)
 * @author small
 *
 */
public class SingleDemo2 {
	 private static SingleDemo2 instance;
    //私有构造器
	 private SingleDemo2() {
		 
	 }
	 //方法需要 synchronized同步，并发效率低
	 public static synchronized SingleDemo2 getInstance() {
		 if(instance==null) {
			 instance = new SingleDemo2();
		 }
		 return instance;
	 }
}
