package bridge;
/**
 * ��������
 * @author Small
 *
 */
public class Computer2 {
    protected Brand brand;

	public Computer2(Brand b) {
		super();
		this.brand = b;
	}
	public void sale() {
		brand.sale();
	}
    
}
class Desktop2 extends Computer2{

	public Desktop2(Brand b) {
		super(b);
		System.out.println("�������̨ࣺʽ��");
	}
	
}
class Pad2 extends Computer2{

	public Pad2(Brand b) {
		super(b);
		System.out.println("�������ࣺƽ��");
	}
	
}