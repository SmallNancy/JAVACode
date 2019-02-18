package cn.nancy.syn;
/**
 * case:线程安全：取钱  synchronized块
 * @author Nancy
 *
 */
public class LocksafeTest {
  public static void main(String[] args) {
		Account ac = new Account(100, "结婚");
		LockDrawing me = new LockDrawing(ac, 60, "我");
		LockDrawing zmt = new LockDrawing(ac, 70, "你");
		me.start();
		zmt.start();
	}
}

// 账户操作
class LockDrawing extends Thread{
	Account account;     //账户
	int drawMoney;      //取的钱
	int totalDrawMoney; //总共取得钱
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
		
		// 提高性能
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
			System.out.println(this.getName() + "剩余钱数：" + account.money);
			System.out.println(this.getName() + "总共取了钱数：" + totalDrawMoney);
		}
	}
}