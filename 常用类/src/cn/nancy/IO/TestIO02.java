package cn.nancy.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/**
 *      分段读取文件信息
 * @author Nancy
 *
 */
public class TestIO02 {
  public static void main(String[] args) {
		File src = new File("E:/WorkSpace/EclipseWorkspace/JAVACode/常用类/src/cn/nancy/IO/a.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			
			// 分段读取
			byte[] flush = new byte[4];    // 缓存容器
			int len = -1;
			while((len = is.read(flush)) != -1) {
				// 字符数组解码
				String str = new String(flush,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
