package cn.nancy.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *     �쳣����
 * @author Small
 *
 */
public class Test {
  public static void main(String[] args) {
  	FileReader fr = null;
		try {
			fr = new FileReader("E:/a.txt");
			char c = (char)fr.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
