package cn.nancy.syn;
/**
 * 多线程，设计一个游戏系统，初始玩家20分，游戏有3个线程，
 * 分别为最高分线程，游戏线程，死亡线程
 * 最高分线程，当玩家现在得分高于历史最高分时，输出"玩家最高分为XX"。响应时长100ms
 * 游戏线程，模拟玩家游戏，随机从+2，+4，+6和-1，-5，-8中选取一种，对玩家得分进行操作.每秒执行2次。并且实时输出玩家得分。
 * 死亡线程，当玩家得分少于等于0分时，输出"游戏结束，历史最高分为XX"，并结束程序。响应时长10ms
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
					System.out.println("游戏结束，历史最高分为："+res.maxScore);
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
						System.out.println("玩家最高分为"+res.maxScore);
					}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
/**
 * 模拟玩家游戏，随机从+2，+4，+6和-1，-5，-8中选取一种，
 * 对玩家得分进行操作.每秒执行2次。并且实时输出玩家得分。
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
					//双重检测
					res.score += arr[(int)(Math.random() * 6)];
					System.out.println("游戏中，玩家的分为" + res.score);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
}
