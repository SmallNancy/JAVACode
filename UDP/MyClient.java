package udpTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
/**
 * �ͻ���
 * 1��������������+�˿ں�
 * 2��׼������
 * 3����װ���� byte[] �������
 * 4����������
 * 5���ͷ���Դ
 * @author nancy
 *
 */
public class MyClient {
	public static void main(String[] args) throws IOException {
		//���������+�˿�
		DatagramSocket client = new DatagramSocket(666);
		//׼������
		String msg ="udp���";
		byte[] data = msg.getBytes();
		//���
		DatagramPacket packet = new DatagramPacket(data, data.length,new InetSocketAddress("localhost",8888) );
		//����
		client.send(packet);
		//�ͷ�
		client.close();
		
		
	}

}
