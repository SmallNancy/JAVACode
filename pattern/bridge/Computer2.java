package bridge;
/**
 * 电脑类型
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
		System.out.println("销售种类：台式机");
	}
	
}
class Pad2 extends Computer2{

	public Pad2(Brand b) {
		super(b);
		System.out.println("销售种类：平板");
	}
	
}