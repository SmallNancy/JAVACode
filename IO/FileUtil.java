package cn.nancy.IOFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtil {
	public static void copyFile(File src,File dest) throws IOException {
		if (!src.isFile()) {
			System.out.println("只能拷贝文件");
			throw new IOException();
		}
		if (dest.isDirectory()) {
			System.out.println("只能拷贝文件");
			throw new IOException("只能拷贝文件");
		}
		//选择流
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(dest);
	}

}
