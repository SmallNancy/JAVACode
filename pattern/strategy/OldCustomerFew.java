package strategy;

public class OldCustomerFew implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("旧客户，小批量，打8.5折");
		return standardPrice * 0.85;
	}

}
