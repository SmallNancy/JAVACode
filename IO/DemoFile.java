package cn.nancy.IOFile;

import java.io.File;

public class DemoFile {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		//File src = new File("D:/code/javacode/text.doc");
		File src = new File("2.txt");
		System.out.println(src.getName());//返回名称
		System.out.println(src.getPath());//相对路径
		System.out.println(src.getAbsolutePath());//返回绝对路径
		System.out.println(src.getParent());//返回上一级目录,如果相对返回null
	}

}
