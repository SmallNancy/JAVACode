package cn.nancy.factory.simpleFactory;

/**
 * 简单工厂模式
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
