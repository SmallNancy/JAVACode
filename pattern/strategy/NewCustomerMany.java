package strategy;

public class NewCustomerMany implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("�¿ͻ�������������9��");
		return standardPrice * 0.9;
	}

}
