package cn.nancy.Singleton;
/**
 * ²âÊÔµ¥Àý
 * @author Small
 *
 */
public class Client {
  public static void main(String[] args) {
		Singleton01 s = Singleton01.instance();
		Singleton02 s2 = Singleton02.getInstance();
		Singleton s3 = Singleton.INSTANCE;
	}
}
