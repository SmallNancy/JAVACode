package simpleFactory;
/**
 * �򵥹��������
 * ͨ��ʹ��
 * @author Small
 *
 */
public class Client02 {//������
	public static void main(String[] args) {
		Car c1 = CarFactory.createCar("�µ�");
		Car c2 = CarFactory.createCar("���ǵ�");
		
		c1.run();
		c2.run();
	}
    
}
