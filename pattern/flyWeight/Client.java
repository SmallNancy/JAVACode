package flyWeight;
/**
 * ��Ԫģʽ
 * @author Small
 *
 */
public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = FlyFactory.getChess("��ɫ");
		System.out.println(chess1);
	}

}
