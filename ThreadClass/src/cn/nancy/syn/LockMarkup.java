package cn.nancy.syn;
/**
 * ģ�������Ĳ���
 * @author Nancy
 *
 */
public class LockMarkup {
  public static void main(String[] args) {
		MarkupTest t = new MarkupTest(1, "��");
		MarkupTest t1 = new MarkupTest(0, "��");
		new Thread(t).start();
		new Thread(t1).start();
	}
}

class Lipstick{
	
}

class Mirror{
	
}

class MarkupTest implements Runnable{
	//static ��̬������ÿ��ֻ��һ��
	static Lipstick lpis = new Lipstick();
	static Mirror mirror = new Mirror();
	int choice;
	String name;
	
	public MarkupTest(int choice, String name) {
		super();
		this.choice = choice;
		this.name = name;
	}

	@Override
	public void run() {
		mark();
	}
	private void mark() {
		if(choice == 1) {
			synchronized(lpis) {
				System.out.println(name + "��ÿں�");
				try {
					Thread.sleep((int)(1000*Math.random()));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(mirror) {
					System.out.println(name + "��þ��ӣ���ʼ��ױ");
				}
			}
		}else {
			synchronized(mirror) {
				System.out.println(name + "��þ���");
				try {
					Thread.sleep((int)(2000 * Math.random()));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lpis) {
					System.out.println(name + "��ÿں죬��ʼ��ױ");
				}
			}
		}
	}
}
