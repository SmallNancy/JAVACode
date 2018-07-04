package decorator;
/**
 * 装饰模式
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println("增加飞行功能");
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		System.out.println("再增加一个新功能");
		WaterCar water = new WaterCar(flycar);
		water.move();
		System.out.println("----------两个新功能增加---");
		WaterCar car1 = new WaterCar(new FlyCar(car));
		car1.move();
	}
}
