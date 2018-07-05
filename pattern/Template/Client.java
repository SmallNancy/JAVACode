package templateMethod;
/**
 * 模板方法模式
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		BankTemplate bank = new DrawMoney();
		bank.process();
		BankTemplate b2 = new BankTemplate() {
			//匿名内部类
			@Override
			public void transact() {
				System.out.println("我要存钱");	
			}
		};
		b2.process();
	}
}

class DrawMoney extends BankTemplate{

	@Override
	public void transact() {
		// TODO Auto-generated method stub
		System.out.println("我要取款");
	}
	
}