package facade;
/**
 * 外观模式，典型的封装
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		new RegisterFacade().register();
	}
}
