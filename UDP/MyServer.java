package udpTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
/**
 * �����
 * 1�����������+�˿ں� DatagramSocket
 * 2��׼����������
 * 3����װ�ɰ�
 * 4����������
 * 5����������
 * 6���ͷ���Դ
 * @author nancy
 *
 */
public class MyServer {
	public static void main(String[] args) throws IOException {
		//�����+�˿ں�
		DatagramSocket server = new DatagramSocket(8888);
		//׼����������
		byte[] container = new byte[1024];
		//��װ�ɰ�
		DatagramPacket packet = new DatagramPacket(container,container.length);
		//��������
		server.receive(packet);
		//��������
		byte[] data = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(data,0,len));
		//�ͷ�
		server.close();
	}

}
