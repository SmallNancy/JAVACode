package cn.nancy.cooperation;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo {
	public static void main(String[] args) {
		Timer time = new Timer();
		Calendar c = new GregorianCalendar(2019, 2, 20, 15, 35, 0);
		time.schedule(new MyTask(), c.getTime(),200);
	}

}
class MyTask extends TimerTask{

	@Override
	public void run() {
		for(int i = 0;i < 10;i++) {
			System.out.println(i + "¿ªÑ§ÁË");
		}
		System.out.println("-----end-----");
	}
	
}
