package cn.nancy.test;

import java.io.File;
import java.io.IOException;

public class TestFile {
  public static void main(String[] args) {
		File f = new File("E:\\aa\\a.txt");
		System.out.println(f);
		f.renameTo(new File("E:/aa/b.txt"));
		System.out.println(System.getProperty("user.dir"));
		File f2 = new File("aa.txt");
		try {
			f2.createNewFile();   //创建新文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
