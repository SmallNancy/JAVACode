package tcpChat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 聊天室
 * @author nancy
 *
 */
public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost", 999);
		//输出流
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		//控制台输入流
		while(true) {
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			String info = console.readLine();
			dos.writeUTF(info);
			dos.flush();
			//输入流
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String msg =dis.readUTF();
			System.out.println(msg);
		}
	}
}
