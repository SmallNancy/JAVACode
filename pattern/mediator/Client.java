package mediator;
/**
 * 中介者模式
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		Mediator m = new President();
		Market market = new Market(m);
		Department devp = new Development(m);
		Finacial f = new Finacial(m);
		
		market.selfAction();
		market.outAction();
	}
}
