package cn.nancy.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/**
 * IO标准步骤
 *       一个一个字符读取
 * @author Nancy
 *
 */
public class IOtest {
	public static void main(String[] args) {
		// 1、File 创建源
		File src = new File("E:/WorkSpace/EclipseWorkspace/JAVACode/常用类/src/cn/nancy/IO/a.txt");
		//String src = "E:/WorkSpace/EclipseWorkspace/JAVACode/常用类/src/cn/nancy/IO/a.txt";
		InputStream is = null;
		try {
			// 2、选择流
			is = new FileInputStream(src);
			//3、操作
			int temp;
			while((temp = is.read()) != -1) {
				System.out.print((char)temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(is != null) {
				try {
					//4、关闭流
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
