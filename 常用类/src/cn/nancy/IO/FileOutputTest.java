package cn.nancy.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputTest {
  public static void main(String[] args) {
		File desc = new File("dest.txt");
		OutputStream os = null;
		try {
			// os = new FileOutputStream(desc);   // Ĭ��ÿ�δ���д
			os = new FileOutputStream(desc,true);  // ׷��
			String msg = "hello,nancy";
			byte[] datas = msg.getBytes();          // ����
			os.write(datas, 0, datas.length);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
