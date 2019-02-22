package cn.nancy.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * ���շ�
 * 1��DatagramSocketָ���˿ںţ��������ն�
 * 2��׼������,��װ�ɰ�
 * 3����������
 * 4����������
 * 5���ر���Դ
 * @author Nancy
 *
 */
public class Receiver {
  public static void main(String[] args) throws Exception {
  	System.out.println("���շ���������----");
  	
  	// 1��DatagramSocketָ���˿ںţ��������ն�
  	DatagramSocket receiver = new DatagramSocket(9999);
  	
  	//2��׼������,��װ�ɰ�
  	byte[] contain = new byte[1024];
  	DatagramPacket packet = new DatagramPacket(contain, 0, contain.length);
  	
  	//3����������
  	receiver.receive(packet);
  	
  	//4����������
  	byte[] datas = packet.getData();
  	int len = packet.getLength();
  	System.out.println(new String(datas,0,len));
  	
  	//�ر���Դ
  	receiver.close();
	}
}
