package mypro04;
/**
 * test �ڲ���
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
		//�Ǿ�̬�ڲ���
		public void show() {
			int age = 30;
			System.out.println("�ⲿ��Ա����:" + Outer.this.age);
			System.out.println("�ڲ����Ա������" + this.age);
			System.out.println("�ڲ����Ա������" + age);
		}
	}
}
