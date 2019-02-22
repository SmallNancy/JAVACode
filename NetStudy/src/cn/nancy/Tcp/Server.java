package cn.nancy.Tcp;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端：
 * 1、利用ServerSocket创建服务器，指定端口
 * 2、阻塞式等待连接    accept方法 返回一个新的socket
 * 3、操作：输入输出流处操作
 * 4、关闭连接
 * @author Nancy
 *
 */
public class Server {
  public static void main(String[] args) throws Exception {
  	System.out.println("---server---");
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();
		System.out.println("一个客户端建立连接");
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String datas = dis.readUTF();
		System.out.println(datas);
		dis.close();
	}
}
