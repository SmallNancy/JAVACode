package cn.nancy.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
/**
 *    ��ӡ��
 * @author Nancy
 *
 */
public class PrintTest {
	public static void main(String[] args) throws IOException {
	  PrintStream ps = System.out;
	  ps.println("��ӡ��");
	  ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
	  ps.println("��ӡ��");
	  ps.println("���2019");
	  
	  
	  //�ض��������
	  System.setOut(ps);
	  System.out.println("");
	  
	}

}
