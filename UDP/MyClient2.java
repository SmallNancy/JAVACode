package udpTest;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
/**
 * �ͻ���
 * 1��������������+�˿ں�
 * 2��׼������ double-->�ֽ����� �������
 * 3����װ���� byte[] �������
 * 4����������
 * 5���ͷ���Դ
 * @author nancy
 *
 */
public class MyClient2 {
	public static void main(String[] args) throws IOException {
		//���������+�˿�
		DatagramSocket client = new DatagramSocket(666);
		//׼������
		double num = 89.12;
		//String msg ="udp���";
		byte[] data = convert(num);
		//���
		DatagramPacket packet = new DatagramPacket(data, data.length,new InetSocketAddress("localhost",8888) );
		//����
		client.send(packet);
		//�ͷ�
		client.close();
		
		
	}
	/**
	 * �ֽ�����+Data�����
	 * @param num
	 * @return
	 * @throws IOException 
	 */
    public static byte[] convert(double num) throws IOException {
    	byte[] data = null;
    	ByteArrayOutputStream bos = new ByteArrayOutputStream();
    	DataOutputStream dos = new DataOutputStream(bos);
    	dos.writeDouble(num);
    	dos.flush();
    	//��ȡ����
    	data = bos.toByteArray();
    	dos.close();
    	return data;
    }
}
