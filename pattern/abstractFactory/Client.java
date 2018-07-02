package abstractFactory;
/**
 * 抽象方法模式
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.run();
		e.start();
	}
}
