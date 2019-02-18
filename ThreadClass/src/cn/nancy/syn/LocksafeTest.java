package cn.nancy.syn;
/**
 * case:�̰߳�ȫ��ȡǮ  synchronized��
 * @author Nancy
 *
 */
public class LocksafeTest {
  public static void main(String[] args) {
		Account ac = new Account(100, "���");
		LockDrawing me = new LockDrawing(ac, 60, "��");
		LockDrawing zmt = new LockDrawing(ac, 70, "��");
		me.start();
		zmt.start();
	}
}

// �˻�����
class LockDrawing extends Thread{
	Account account;     //�˻�
	int drawMoney;      //ȡ��Ǯ
	int totalDrawMoney; //�ܹ�ȡ��Ǯ
	public LockDrawing(Account account, int drawMoney,String name) {
		super(name);
		this.account = account;
		this.drawMoney = drawMoney;
	}
	@Override
	public void run() {
		test01();
	}
	public void test01() {
		
		// �������
		if(account.money <= 0) {
			return;
		}
		synchronized (account) {
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
}