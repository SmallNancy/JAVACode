package abstractFactory;
/**
 * ��̥
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
		System.out.println("��ĥ��");
	}
	
}
class LowTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("ĥ��");
	}
	
}
