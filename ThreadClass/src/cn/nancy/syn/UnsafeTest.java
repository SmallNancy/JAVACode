package cn.nancy.syn;
/**
 * case:�̲߳���ȫ��ȡǮ ���ָ���
 * @author Nancy
 *
 */
public class UnsafeTest {
  public static void main(String[] args) {
		Account ac = new Account(100, "���");
		Drawing me = new Drawing(ac, 60, "��");
		Drawing zmt = new Drawing(ac, 70, "��");
		me.start();
		zmt.start();
	}
}
// �˻�����
class Drawing extends Thread{
	Account account;     //�˻�
	int drawMoney;      //ȡ��Ǯ
	int totalDrawMoney; //�ܹ�ȡ��Ǯ
	public Drawing(Account account, int drawMoney,String name) {
		super(name);
		this.account = account;
		this.drawMoney = drawMoney;
	}
	@Override
	public void run() {
		if(account.money - drawMoney < 0) {
			return;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		account.money -= drawMoney;
		totalDrawMoney += drawMoney;
		System.out.println(this.getName() + "ʣ��Ǯ����" + account.money);
		System.out.println(this.getName() + "�ܹ�ȡ��Ǯ����" + totalDrawMoney);
	}
}