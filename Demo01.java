package cn.nancy.charIOFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * ���ı���ȡ
 * @author Small
 *
 */
public class Demo01 {
	public static void main(String[] args) throws IOException {
		File src = new File("D:/important/hello.txt");
		Reader reader = null;
		try {
			reader = new FileReader(src);
			//��ȡ����
			char[] flush = new char[10];
			int len = 0;
			while(-1!=(len = reader.read(flush))) {
				String str = new String(flush);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Դ�ļ�������");
		}
	}

}
