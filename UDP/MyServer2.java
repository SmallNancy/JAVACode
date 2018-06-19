package udpTest;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
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
 * 5����������  �ֽ���-->double ������
 * 6���ͷ���Դ
 * @author nancy
 *
 */
public class MyServer2 {
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
		double data = convert(packet.getData());
		int len = packet.getLength();
		System.out.println(data);
		//�ͷ�
		server.close();
	}
	/**
	 *  �ֽ�����+Data������
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
