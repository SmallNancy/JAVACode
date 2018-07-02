package factorymethod;
/**
 * ��������ģʽ��
 * �õ��٣������ӣ����Ͽ���ԭ��
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
