package cn.nancy.IO;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandTest {
  public static void main(String[] args) throws IOException {
  	test();
	}
  /**
   *    指定起始位置，读取剩余所有
   * @throws IOException
   */
  public static void test()throws IOException {
  	RandomAccessFile raf = new RandomAccessFile(new File("src/cn/nancy/IO/Decorate.java"), "r");
  	raf.seek(2);
  	byte[] flush = new byte[1024];
  	int len = -1;
  	while((len = raf.read(flush)) != -1) {
  		System.out.println(new String(flush,0,len));
  	}
  	raf.close();
  }
}
