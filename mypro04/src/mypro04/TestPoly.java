package mypro04;
/**
 *  ���Զ�̬
 *  �ر����� 1���̳� 2�� ��д 3����������ָ����������
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
		System.out.println("��һ��");
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