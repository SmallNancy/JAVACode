package tcpTest;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端
 * 1、创建客户端，必须指定服务器端+端口，此时就在连接
 *      socket(String host,int post)
 *   2、接收数据+发送数据
 * @author nancy
 *
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost",8888);
		/*BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String echo = br.readLine();
		System.out.println(echo);
		*/
		DataInputStream dis = new DataInputStream(client.getInputStream());
		System.out.println(dis.readUTF());
	}

}
