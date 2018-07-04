package facade;

public interface 银行 {
    void openAccount();
}

class 工商银行 implements 银行{

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("工商银行开户");
	}
	
}