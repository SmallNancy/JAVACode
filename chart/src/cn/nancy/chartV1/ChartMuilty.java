package cn.nancy.chartV1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChartMuilty {
	public static void main(String[] args) throws Exception {
		System.out.println("---��������------");
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();
		System.out.println("-----��������-------");
		
		//��������������
		DataInputStream dis = new DataInputStream(client.getInputStream());
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		boolean flag = true;
		while(flag) {
			String msg = dis.readUTF();
			//��������������
			dos.writeUTF(msg);
			dos.flush();
		}
		dis.close();
		dos.close();
		client.close();
	}

}
