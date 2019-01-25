package mypro04;
/**
 * test 内部类
 * @author Small
 *
 */
public class TestInner {
	public static void main(String[] args) {
//		String[] a = {"aa","bb","cc"};
//		String[] b = new String[4];
//		System.arraycopy(a, 1, b, 0, 2);
//		for(String temp:b) {
//			System.out.print(temp+" ");
//		}
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}
}

class Outer{
	private int age = 10;
	class Inner{
		int age = 20;
		//非静态内部类
		public void show() {
			int age = 30;
			System.out.println("外部成员变量:" + Outer.this.age);
			System.out.println("内部类成员变量：" + this.age);
			System.out.println("内部类成员变量：" + age);
		}
	}
}
