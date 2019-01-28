package cn.nancy.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
  public static void main(String args[]) {
  	long d = System.currentTimeMillis();
  	System.out.println(d);
  	DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
  	try {
			Date date = format.parse("2013-2-3 13:12:34");
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//  	String str = format.format(new Date(400000));
//  	System.out.println(str);
  }
}
