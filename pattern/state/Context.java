package state;
/**
 * 不同状态切换，上下文类
 * @author Small
 *
 */
public class Context {
    private State state;

	public void setState(State s) {
		System.out.println("修改状态");
		state = s;
		state.handle();
	}
    
}
