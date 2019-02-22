package cn.nancy.chartV1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 在线聊天室基于TCP 客户端
 * 实现一个客户端可以收发一条信息
 * @author Nancy
 *
 */
public class Client {
  public static void main(String[] args) throws IOException {
  	System.out.println("---客户端---");
		Socket client = new Socket("localhost", 8888);
		
		//客户端发出信息
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String msg = console.readLine();
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		//客户端接收信息
		DataInputStream dis = new DataInputStream(client.getInputStream());
		msg = dis.readUTF();
		System.out.println(msg);
		
		dos.close();
		dis.close();
		client.close();
	}
}
