package strategy;

public class OldCustomerMany implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("�Ͽͻ�������������7.5��");
		return standardPrice * 0.75;
	}

}
