package cn.nancy.test;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class TestCalender {
  public static void main(String[] args) {
		Calendar c = new GregorianCalendar(2013,10,9,22,10,50);
		System.out.println("year" + c.get(Calendar.YEAR));
		System.out.println("month:" + c.get(Calendar.MONTH));
	}
}
