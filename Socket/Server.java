package tcpTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP Socket
 * 1��������������ָ���˿�ServerSocket
 * 2�����տͻ��˵����� ����ʽ
 * 3����������+��������
 * @author Z.M.T
 *
 */
public class Server {
	public static void main(String[] args) throws IOException {
		//������������ָ���˿�ServerSocket
		ServerSocket server = new ServerSocket(8888);
        //���տͻ��˵����� ����ʽ
		Socket socket = server.accept();
		System.out.println("һ���ͻ��˽�������");
		//��������
		String msg = "��ӭʹ��";
		//�����
		/*BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream()));
		bw.write(msg);
		bw.close();
		bw.newLine();
		bw.flush();
		*/
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
	}

}
