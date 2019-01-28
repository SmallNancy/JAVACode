package cn.nancy.test;

import java.io.File;
/**
 *     打印目录
 * @author Small
 *
 */
public class PrintFileTree {
  public static void main(String[] args) {
		File f = new File("E:\\报告");
		printFile(f,0);
	}
  
  public static void printFile(File file,int level) {
  	for(int i = 0;i < level;i++) {
  		System.out.print("--");
  	}
  	System.out.println(file.getName());
  	if(file.isDirectory()) {
  		File[] files = file.listFiles();
  		for(File temp:files) {
  			printFile(temp,level + 1);
  		}
  	}
  }
}
