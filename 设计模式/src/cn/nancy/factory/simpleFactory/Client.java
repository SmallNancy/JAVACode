package cn.nancy.factory.simpleFactory;

/**
 * �򵥹���ģʽ
 * @author Nancy
 *
 */
public class Client {
  public static void main(String[] args) {
		Car c = CarFactory.createBaoMa();
		Car byd = CarFactory.createBYQ();
		c.run();
		byd.run();
	}
}
