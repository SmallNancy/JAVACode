package abstractFactory;
/**
 * ÂÖÌ¥
 * @author Small
 *
 */
public interface Tyre {
    void revolve();
}
class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("²»Ä¥Ëð");
	}
	
}
class LowTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Ä¥Ëð");
	}
	
}
