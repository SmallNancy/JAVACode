package singleton;
/**
 * 测试枚举类实现单例模式
 * 加载类时，天然的线程安全
 * @author small
 *
 */
public enum SingleDemo4 {
	//枚举元素，本身是单例
	INSTANCE;
	//添加自己需要的操作
	public void SingletonOperation() {
		
	}
}
