package singleton;
/**
 * 测试懒汉式单例模式
 * @author small
 *
 */
public class SingleDemo5 {
	 private static SingleDemo5 instance;
    //私有构造器
	 private SingleDemo5() {
		 if(instance!=null) {
			 throw new RuntimeException();
		 }
	 }
	 //方法需要 synchronized同步，并发效率低
	 public static synchronized SingleDemo5 getInstance() {
		 if(instance==null) {
			 instance = new SingleDemo5();
		 }
		 return instance;
	 }
}
