package udpTest;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
/**
 * 服务端
 * 1、创建服务端+端口号 DatagramSocket
 * 2、准备接收容器
 * 3、封装成包
 * 4、接收数据
 * 5、分析数据  字节数-->double 输入流
 * 6、释放资源
 * @author nancy
 *
 */
public class MyServer2 {
	public static void main(String[] args) throws IOException {
		//服务端+端口号
		DatagramSocket server = new DatagramSocket(8888);
		//准备接收容器
		byte[] container = new byte[1024];
		//封装成包
		DatagramPacket packet = new DatagramPacket(container,container.length);
		//接收数据
		server.receive(packet);
		//分析数据
		double data = convert(packet.getData());
		int len = packet.getLength();
		System.out.println(data);
		//释放
		server.close();
	}
	/**
	 *  字节数组+Data输入流
	 * @param data
	 * @return
	 * @throws IOException 
	 */
	public static double convert(byte[] data) throws IOException {
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data));
		double num = dis.readDouble();
		dis.close();
		return num;
	}

}
