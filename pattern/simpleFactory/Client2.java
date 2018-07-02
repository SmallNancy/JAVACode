package simpleFactory;

public class Client2 {
    public static void main(String[] args) {
		Car c1 = CarFactory2.createAudi();
		c1.run();
	}
}
