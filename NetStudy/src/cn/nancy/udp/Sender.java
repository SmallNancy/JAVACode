package cn.nancy.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
/**
 * ���ͷ� 
 * 1��DatagramSocket ָ���˿ں�
 * 2��׼�����ݡ�
 * 3��ת���ֽ����顢��װ�ɰ�
 * 4������
 * 5���ر���Դ
 * @author Nancy
 *
 */
public class Sender {
 public static void main(String[] args) throws Exception {
	 System.out.println("���ͷ���������----");
	DatagramSocket sender = new DatagramSocket(8888);
	String letter = "ZMT,2017.105Love";
	byte[] datas = letter.getBytes();
	DatagramPacket packet = new DatagramPacket(datas, datas.length,
			new InetSocketAddress("localhost",9999));
	sender.send(packet);
	sender.close();
}
}
