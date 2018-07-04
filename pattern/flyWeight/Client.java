package flyWeight;
/**
 * 享元模式
 * @author Small
 *
 */
public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = FlyFactory.getChess("黑色");
		System.out.println(chess1);
	}

}
