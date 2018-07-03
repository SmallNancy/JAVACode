package bridge;
/**
 * 正常写，繁琐，复杂
 * @author Small
 *
 */
public interface Computer {
    void sale();
}
class Desktop implements Computer{
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("销售台式机");
	}
	
}
class Laptop implements Computer{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("销售笔记本电脑");
	}
	
}
class Pad implements Computer{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("销售平板");
	}
	
}

class LenovoDesk extends Desktop{
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("销售联想台式机");
	}
	
}
