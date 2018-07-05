package state;
/**
 * 已预定状态
 * @author Small
 *
 */
public class BookedState implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("已经预订");
	}

}
