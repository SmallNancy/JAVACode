package cn.nancy.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
/**
 *    打印流
 * @author Nancy
 *
 */
public class PrintTest {
	public static void main(String[] args) throws IOException {
	  PrintStream ps = System.out;
	  ps.println("打印流");
	  ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
	  ps.println("打印流");
	  ps.println("你好2019");
	  
	  
	  //重定向输出端
	  System.setOut(ps);
	  System.out.println("");
	  
	}

}
