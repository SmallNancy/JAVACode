package tcpChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(999);
		Socket client = server.accept();
		//������д������
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String msg =dis.readUTF();
		//�����
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF("������-->"+msg);
		dos.flush();
		
	}

}
