package command;
/**
 * ����ģʽ
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		Command c = new ConcreteCommand(new Receiver());
		Invoke i = new Invoke(c);
		i.call();
	}
}
