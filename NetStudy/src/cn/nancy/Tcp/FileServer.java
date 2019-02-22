package cn.nancy.Tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �ļ��ϴ�
 * �������ˣ���������
 * 1������ServerSocket������������ָ���˿�
 * 2������ʽ�ȴ�����    accept���� ����һ���µ�socket
 * 3�����������������������
 * 4���ر�����
 * @author Nancy
 *
 */
public class FileServer {
  public static void main(String[] args) throws Exception {
  	System.out.println("---server---");
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();
		System.out.println("һ���ͻ��˽�������");
    OutputStream os = new BufferedOutputStream(new FileOutputStream("src/copy.png"));
    InputStream is = new BufferedInputStream(client.getInputStream());
    byte[] flush = new byte[1024];
    int len = -1;
    while(-1 !=(len = is.read(flush))) {
    	os.write(flush, 0,len);
    }
    os.flush();
    os.close();
    is.close();
    client.close();
	}
}
