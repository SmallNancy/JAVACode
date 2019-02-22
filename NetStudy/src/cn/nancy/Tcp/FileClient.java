package cn.nancy.Tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * �ļ��ϴ�
 * �ͻ��ˣ��ϴ�����
 * Socket����ͻ��ˣ�ָ���������ĵ�ַ�Ͷ˿�
 * @author Nancy
 *
 */
public class FileClient {
  public static void main(String[] args) throws IOException, IOException {
  	System.out.println("--client--");
		Socket client = new Socket("localhost", 8888);
		
		InputStream is = new BufferedInputStream(new FileInputStream("src/aa.png"));
		OutputStream os = new BufferedOutputStream(client.getOutputStream());
		byte[] flush = new byte[1024];
		int len = -1;
		while(-1 != (len = is.read(flush))) {
			os.write(flush);
		}
		os.flush();
		os.close();
		is.close();
		client.close();
	}
}
