package mypro04;
/**
 *  测试多态
 *  必备条件 1、继承 2、 重写 3、父类引用指向子类引用
 * @author Small
 *
 */
public class TestPoly {
    public static void main(String[] args) {
    	 Animal a = new Dog();
    	 Cat c = (Cat)a;
    	 shoutAnimal(a);
		shoutAnimal(new Cat());
	}
    static void shoutAnimal(Animal a) {
    	a.shout();
    }
}

class Animal{
	public void shout() {
		System.out.println("叫一下");
	}
}
class Cat extends Animal{
	public void shout() {
		System.out.println("miao miao");
	}
}
class Dog extends Animal{
	public void shout() {
		System.out.println("wang wang wang");
	}
}