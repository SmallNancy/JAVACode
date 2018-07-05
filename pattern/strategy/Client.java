package strategy;
/**
 * ²ßÂÔÄ£Ê½
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		Strategy s1 = new OldCustomerMany();
		Context c1 = new Context(s1);
		c1.printPrice(1000);
	}
}
