package mypro04;

public class TestInterface {

}

interface Fly{
	int HEIGHT = 100;
	void Sing();
}

interface A{
	void eat();
}

interface B extends Fly,A{
	void sleep();
}

/**
 *  implements 接口实现多继承
 * @author Small
 *
 */
class C implements B{

	@Override
	public void Sing() {
		System.out.println("sing");
	}

	@Override
	public void eat() {
		System.out.println("eat");
	}

	@Override
	public void sleep() {
		System.out.println("sleep");
	}
	 
 }

