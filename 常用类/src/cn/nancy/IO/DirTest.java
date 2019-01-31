package cn.nancy.IO;

import java.io.File;

public class DirTest {
	public static void main(String[] args) {
		File src = new File("E:/¼òÀú/");
		printName(src,0);
	}
	
	public static void printName(File src,int deep) {
		System.out.println(src.getName());
		for(int i = 0;i < deep;i++) {
			System.out.print("-");
		}
		if(!src.exists()||null == src) {
			return;
		}else if (src.isDirectory()) {
			for(File s:src.listFiles()) {
				printName(s, deep + 1);
			}
		}
	}

}
