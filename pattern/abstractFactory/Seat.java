package abstractFactory;
/**
 * ����
 * @author Small
 *
 */
public interface Seat {
    void message();
}

class LuxurySeat implements Seat{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("�����Զ���Ħ");
	}
	
}
class LowSeat implements Seat{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("�����԰�Ħ");
	}
	
}
