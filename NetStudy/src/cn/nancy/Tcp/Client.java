package cn.nancy.Tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * TCP�������̣�
 * �ͻ��ˣ�
 * Socket����ͻ��ˣ�ָ���������ĵ�ַ�Ͷ˿�
 * @author Nancy
 *
 */
public class Client {
  public static void main(String[] args) throws IOException, IOException {
  	System.out.println("--client--");
		Socket client = new Socket("localhost", 8888);
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		String msg = "hello,csu";
		dos.writeUTF(msg);
		dos.flush();
		dos.close();
		client.close();
	}
}
