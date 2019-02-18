package cn.nancy.syn;
/**
 * case:线程不安全：取钱 出现负数
 * @author Nancy
 *
 */
public class UnsafeTest {
  public static void main(String[] args) {
		Account ac = new Account(100, "结婚");
		Drawing me = new Drawing(ac, 60, "我");
		Drawing zmt = new Drawing(ac, 70, "你");
		me.start();
		zmt.start();
	}
}
// 账户操作
class Drawing extends Thread{
	Account account;     //账户
	int drawMoney;      //取的钱
	int totalDrawMoney; //总共取得钱
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
		System.out.println(this.getName() + "剩余钱数：" + account.money);
		System.out.println(this.getName() + "总共取了钱数：" + totalDrawMoney);
	}
}