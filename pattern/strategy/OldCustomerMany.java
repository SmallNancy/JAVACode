package strategy;

public class OldCustomerMany implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("老客户，大批量，打7.5折");
		return standardPrice * 0.75;
	}

}
