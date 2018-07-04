package decorator;
/**
 * 抽象组件
 * @author Small
 *
 */
public interface ICar {
    void move();
}
//构建具体角色（真实对象）
class Car implements ICar{

	@Override
	public void move() {
	    System.out.println("陆地上跑");
	}
	
}
class SuperCar implements ICar{
    protected ICar car;
    //持有真实角色的引用
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

//具体装饰对象
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("天上飞");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
	
}

//具体装饰对象
class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void swim() {
		System.out.println("水里游");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
}

//具体装饰对象
class AiCar extends SuperCar{

	public AiCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void autoMove() {
		System.out.println("无人驾驶");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		autoMove();
	}
}
