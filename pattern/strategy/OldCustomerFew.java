package strategy;

public class OldCustomerFew implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("�ɿͻ���С��������8.5��");
		return standardPrice * 0.85;
	}

}
