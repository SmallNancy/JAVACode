package cn.nancy.Tcp;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �������ˣ�
 * 1������ServerSocket������������ָ���˿�
 * 2������ʽ�ȴ�����    accept���� ����һ���µ�socket
 * 3�����������������������
 * 4���ر�����
 * @author Nancy
 *
 */
public class Server {
  public static void main(String[] args) throws Exception {
  	System.out.println("---server---");
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();
		System.out.println("һ���ͻ��˽�������");
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String datas = dis.readUTF();
		System.out.println(datas);
		dis.close();
	}
}
