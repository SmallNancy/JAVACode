package cn.nancy.chartV1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientMuilty {
	public static void main(String[] args) throws IOException {
		System.out.println("-----�ͻ���----");
		Socket client = new Socket("localhost", 8888);
		
		//�ͻ��˷�����Ϣ
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		DataInputStream dis = new DataInputStream(client.getInputStream());
		boolean flag = true;
		while(flag) {
			String msg = console.readLine();
			dos.writeUTF(msg);
			dos.flush();
			//�ͻ��˽�������
			msg = dis.readUTF();
			System.out.println(msg);
		}
		dos.close();
		dis.close();
		client.close();
	}

}
