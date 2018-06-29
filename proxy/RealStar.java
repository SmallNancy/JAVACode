package proxy;
/**
 * 真实角色
 * @author small
 *
 */
public class RealStar implements Star{

	@Override
	public void conger() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.conger");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.signContract");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.bookTicket");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("RealStar周杰伦.sing");
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.collectMoney");
	}

}
