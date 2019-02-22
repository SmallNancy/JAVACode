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
 * 文件上传
 * 服务器端：下载数据
 * 1、利用ServerSocket创建服务器，指定端口
 * 2、阻塞式等待连接    accept方法 返回一个新的socket
 * 3、操作：输入输出流处操作
 * 4、关闭连接
 * @author Nancy
 *
 */
public class FileServer {
  public static void main(String[] args) throws Exception {
  	System.out.println("---server---");
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();
		System.out.println("一个客户端建立连接");
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
