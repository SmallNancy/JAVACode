package factorymethod;
/**
 * 方法工厂模式，
 * 用的少，类增加，符合开闭原则
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		Car c1 = new AudiFactory().createCar();
		Car c2 = new BydFactory().createCar();
		Car c3 = new BenzFactory().createCar();
		
		c1.run();
		c2.run();
		c3.run();
	}
}
