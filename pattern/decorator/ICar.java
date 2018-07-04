package decorator;
/**
 * �������
 * @author Small
 *
 */
public interface ICar {
    void move();
}
//���������ɫ����ʵ����
class Car implements ICar{

	@Override
	public void move() {
	    System.out.println("½������");
	}
	
}
class SuperCar implements ICar{
    protected ICar car;
    //������ʵ��ɫ������
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		car.move();
	}
	
}

//����װ�ζ���
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("���Ϸ�");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
	
}

//����װ�ζ���
class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void swim() {
		System.out.println("ˮ����");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
}

//����װ�ζ���
class AiCar extends SuperCar{

	public AiCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void autoMove() {
		System.out.println("���˼�ʻ");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		autoMove();
	}
}
