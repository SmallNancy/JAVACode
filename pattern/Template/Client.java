package templateMethod;
/**
 * ģ�巽��ģʽ
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		BankTemplate bank = new DrawMoney();
		bank.process();
		BankTemplate b2 = new BankTemplate() {
			//�����ڲ���
			@Override
			public void transact() {
				System.out.println("��Ҫ��Ǯ");	
			}
		};
		b2.process();
	}
}

class DrawMoney extends BankTemplate{

	@Override
	public void transact() {
		// TODO Auto-generated method stub
		System.out.println("��Ҫȡ��");
	}
	
}