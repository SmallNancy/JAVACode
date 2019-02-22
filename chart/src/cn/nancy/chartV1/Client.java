package cn.nancy.chartV1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ���������һ���TCP �ͻ���
 * ʵ��һ���ͻ��˿����շ�һ����Ϣ
 * @author Nancy
 *
 */
public class Client {
  public static void main(String[] args) throws IOException {
  	System.out.println("---�ͻ���---");
		Socket client = new Socket("localhost", 8888);
		
		//�ͻ��˷�����Ϣ
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String msg = console.readLine();
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		//�ͻ��˽�����Ϣ
		DataInputStream dis = new DataInputStream(client.getInputStream());
		msg = dis.readUTF();
		System.out.println(msg);
		
		dos.close();
		dis.close();
		client.close();
	}
}
