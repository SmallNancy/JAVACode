package cn.nancy.IOFile;

import java.io.File;

public class DemoFile {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		//File src = new File("D:/code/javacode/text.doc");
		File src = new File("2.txt");
		System.out.println(src.getName());//��������
		System.out.println(src.getPath());//���·��
		System.out.println(src.getAbsolutePath());//���ؾ���·��
		System.out.println(src.getParent());//������һ��Ŀ¼,�����Է���null
	}

}
