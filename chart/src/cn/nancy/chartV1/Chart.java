package cn.nancy.chartV1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ���������һ���TCP ��������
 * ʵ��һ���ͻ��˿����շ���Ϣ
 * @author Nancy
 *
 */
public class Chart {
  public static void main(String[] args) throws IOException {
  	System.out.println("-----��������------");
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();               //����ʽ����
		System.out.println("������һ������");
		
		// ������Ϣ
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String msg = dis.readUTF();
		//������Ϣ
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
	}
}
