package cn.nancy.syn;
/**
 * ���̣߳����һ����Ϸϵͳ����ʼ���20�֣���Ϸ��3���̣߳�
 * �ֱ�Ϊ��߷��̣߳���Ϸ�̣߳������߳�
 * ��߷��̣߳���������ڵ÷ָ�����ʷ��߷�ʱ�����"�����߷�ΪXX"����Ӧʱ��100ms
 * ��Ϸ�̣߳�ģ�������Ϸ�������+2��+4��+6��-1��-5��-8��ѡȡһ�֣�����ҵ÷ֽ��в���.ÿ��ִ��2�Ρ�����ʵʱ�����ҵ÷֡�
 * �����̣߳�����ҵ÷����ڵ���0��ʱ�����"��Ϸ��������ʷ��߷�ΪXX"��������������Ӧʱ��10ms
 * @author Nancy
 *
 */
public class DemoThread {
	public static void main(String[] args) {
		Res res = new Res();
		GameThread gt = new GameThread(res);
		DeathThread dt = new DeathThread(res);
		MaxScore ms = new MaxScore(res);
		new Thread(gt).start();
		new Thread(dt).start();
		new Thread(ms).start();
		
	}

}

class Res{
	final int defaultSCORE = 20;
	int score = defaultSCORE;
	int maxScore = 0;
	boolean gameover = false;
}
class DeathThread implements Runnable{
	Res res;
	public DeathThread(Res res) {
		this.res = res;
	}

	@Override
	public void run() {
		while(!res.gameover) {
			try {
				Thread.sleep(10);
				if(res.score<=0) {
					System.out.println("��Ϸ��������ʷ��߷�Ϊ��"+res.maxScore);
					res.gameover = true;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class MaxScore implements Runnable{
	Res res;
	public MaxScore(Res res) {
		this.res = res;
	}
	@Override
	public void run() {
		while(!res.gameover) {
			try {
				Thread.sleep(100);
					if(res.maxScore < res.score) {
						res.maxScore = res.score;
						System.out.println("�����߷�Ϊ"+res.maxScore);
					}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
/**
 * ģ�������Ϸ�������+2��+4��+6��-1��-5��-8��ѡȡһ�֣�
 * ����ҵ÷ֽ��в���.ÿ��ִ��2�Ρ�����ʵʱ�����ҵ÷֡�
 * @author Nancy
 *
 */
class GameThread implements Runnable{
	Res res;
	public GameThread(Res res) {
		this.res = res;
	}
	@Override
	public void run() {
		int[] arr = {1,3,6,-1,-5,-8};
		
		while(!res.gameover) {
			try {
				Thread.sleep(500);
				if(!res.gameover) {
					//˫�ؼ��
					res.score += arr[(int)(Math.random() * 6)];
					System.out.println("��Ϸ�У���ҵķ�Ϊ" + res.score);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
}
