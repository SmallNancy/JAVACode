package bridge;

public class Client {
    public static void main(String[] args) {
		//销售联想pad
    	Computer2 c1 = new Pad2(new Lenovo());
    	c1.sale();
	}
}
