package dynamicProxy;
/**
 * 真实角色
 * @author Small
 *
 */
public class RealStar implements Star{

	@Override
	public void signContract() {
		System.out.println("RealStar.signContract");
		
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket");
		
	}

	@Override
	public void sing() {
		System.out.println("RealStar周杰伦唱歌");
		
	}

}
