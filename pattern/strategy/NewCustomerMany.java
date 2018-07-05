package strategy;

public class NewCustomerMany implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("新客户，大批量，打9折");
		return standardPrice * 0.9;
	}

}
