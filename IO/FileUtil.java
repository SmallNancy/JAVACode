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
			System.out.println("ֻ�ܿ����ļ�");
			throw new IOException();
		}
		if (dest.isDirectory()) {
			System.out.println("ֻ�ܿ����ļ�");
			throw new IOException("ֻ�ܿ����ļ�");
		}
		//ѡ����
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(dest);
	}

}
