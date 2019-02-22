package cn.nancy.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
/**
 * 发送方 
 * 1、DatagramSocket 指定端口号
 * 2、准备数据、
 * 3、转成字节数组、封装成包
 * 4、发送
 * 5、关闭资源
 * @author Nancy
 *
 */
public class Sender {
 public static void main(String[] args) throws Exception {
	 System.out.println("发送方发送数据----");
	DatagramSocket sender = new DatagramSocket(8888);
	String letter = "ZMT,2017.105Love";
	byte[] datas = letter.getBytes();
	DatagramPacket packet = new DatagramPacket(datas, datas.length,
			new InetSocketAddress("localhost",9999));
	sender.send(packet);
	sender.close();
}
}
