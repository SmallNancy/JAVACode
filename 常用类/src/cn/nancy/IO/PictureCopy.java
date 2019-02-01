package cn.nancy.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1、文件转化为字节数组
 * 2、字节数组转化为文件
 * @author Nancy
 *
 */
public class PictureCopy {
	public static void main(String[] args) {
		byte[] datas = fileToByteArray("aa.png");
		arrayToByte(datas,"acopy.png");
	}
	
	/**
	 * 1、文件到程序  FileInputStream
	 * 2、程序到字节数组 ByteArrayOutputStream
	 * @param srcPath 
	 * @return
	 */
	public static byte[] fileToByteArray(String srcPath) {
		File src = new File(srcPath);
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		try{
			is = new FileInputStream(src);
			baos = new ByteArrayOutputStream();
			byte[] flush = new byte[1024*10];
			int len = -1;
			while((len = is.read(flush)) != -1) {
				baos.write(flush, 0, len);
			}
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	/**
	 * 1、字节数组到程序  ByteArrayInputStream
	 * 2、程序到文件   FileOutputStream
	 * @param src
	 * @param descath
	 */
	public static void arrayToByte(byte[] src,String descath) {
		File desc = new File(descath);
		ByteArrayInputStream bais = null;
		OutputStream os = null;
		try {
			bais = new ByteArrayInputStream(src);
			os = new FileOutputStream(desc);
			byte[] flush = new byte[1024*10];
			int len = -1;
			while((len = bais.read(flush)) != -1) {
				os.write(flush);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
