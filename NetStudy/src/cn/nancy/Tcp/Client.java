package cn.nancy.Tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * TCP基本流程：
 * 客户端：
 * Socket监理客户端：指定服务器的地址和端口
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
