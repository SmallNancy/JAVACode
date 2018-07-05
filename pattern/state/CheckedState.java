package state;
/**
 * 已入住状态
 * @author Small
 *
 */
public class CheckedState implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("入住状态，勿打扰");
	}

}
