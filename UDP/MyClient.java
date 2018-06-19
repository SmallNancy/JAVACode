package udpTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
/**
 * 客户端
 * 1、创建服务器端+端口号
 * 2、准备数据
 * 3、封装数据 byte[] 存放数据
 * 4、发送数据
 * 5、释放资源
 * @author nancy
 *
 */
public class MyClient {
	public static void main(String[] args) throws IOException {
		//创建服务端+端口
		DatagramSocket client = new DatagramSocket(666);
		//准备数据
		String msg ="udp编程";
		byte[] data = msg.getBytes();
		//打包
		DatagramPacket packet = new DatagramPacket(data, data.length,new InetSocketAddress("localhost",8888) );
		//发送
		client.send(packet);
		//释放
		client.close();
		
		
	}

}
