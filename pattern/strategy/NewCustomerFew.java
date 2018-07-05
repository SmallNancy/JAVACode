package strategy;

public class NewCustomerFew implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("新客户，小批量，不打折");
		return standardPrice;
	}

}
