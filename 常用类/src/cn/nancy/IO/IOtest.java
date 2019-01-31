package cn.nancy.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/**
 * IO��׼����
 *       һ��һ���ַ���ȡ
 * @author Nancy
 *
 */
public class IOtest {
	public static void main(String[] args) {
		// 1��File ����Դ
		File src = new File("E:/WorkSpace/EclipseWorkspace/JAVACode/������/src/cn/nancy/IO/a.txt");
		//String src = "E:/WorkSpace/EclipseWorkspace/JAVACode/������/src/cn/nancy/IO/a.txt";
		InputStream is = null;
		try {
			// 2��ѡ����
			is = new FileInputStream(src);
			//3������
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
					//4���ر���
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
