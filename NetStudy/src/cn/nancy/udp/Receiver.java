package cn.nancy.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 接收方
 * 1、DatagramSocket指定端口号，创建接收端
 * 2、准备容器,封装成包
 * 3、接收数据
 * 4、分析数据
 * 5、关闭资源
 * @author Nancy
 *
 */
public class Receiver {
  public static void main(String[] args) throws Exception {
  	System.out.println("接收方接收数据----");
  	
  	// 1、DatagramSocket指定端口号，创建接收端
  	DatagramSocket receiver = new DatagramSocket(9999);
  	
  	//2、准备容器,封装成包
  	byte[] contain = new byte[1024];
  	DatagramPacket packet = new DatagramPacket(contain, 0, contain.length);
  	
  	//3、接收数据
  	receiver.receive(packet);
  	
  	//4、分析数据
  	byte[] datas = packet.getData();
  	int len = packet.getLength();
  	System.out.println(new String(datas,0,len));
  	
  	//关闭资源
  	receiver.close();
	}
}
