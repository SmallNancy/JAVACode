package strategy;

public class NewCustomerFew implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("�¿ͻ���С������������");
		return standardPrice;
	}

}
