package decorator;
/**
 * װ��ģʽ
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println("���ӷ��й���");
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		System.out.println("������һ���¹���");
		WaterCar water = new WaterCar(flycar);
		water.move();
		System.out.println("----------�����¹�������---");
		WaterCar car1 = new WaterCar(new FlyCar(car));
		car1.move();
	}
}
