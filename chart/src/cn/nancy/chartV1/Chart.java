package cn.nancy.chartV1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 在线聊天室基于TCP 服务器端
 * 实现一个客户端可以收发信息
 * @author Nancy
 *
 */
public class Chart {
  public static void main(String[] args) throws IOException {
  	System.out.println("-----服务器端------");
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();               //阻塞式连接
		System.out.println("建立了一个连接");
		
		// 接收消息
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String msg = dis.readUTF();
		//返回消息
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
	}
}
