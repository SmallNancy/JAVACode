package udpTest;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
/**
 * 客户端
 * 1、创建服务器端+端口号
 * 2、准备数据 double-->字节数组 用输出流
 * 3、封装数据 byte[] 存放数据
 * 4、发送数据
 * 5、释放资源
 * @author nancy
 *
 */
public class MyClient2 {
	public static void main(String[] args) throws IOException {
		//创建服务端+端口
		DatagramSocket client = new DatagramSocket(666);
		//准备数据
		double num = 89.12;
		//String msg ="udp编程";
		byte[] data = convert(num);
		//打包
		DatagramPacket packet = new DatagramPacket(data, data.length,new InetSocketAddress("localhost",8888) );
		//发送
		client.send(packet);
		//释放
		client.close();
		
		
	}
	/**
	 * 字节数组+Data输出流
	 * @param num
	 * @return
	 * @throws IOException 
	 */
    public static byte[] convert(double num) throws IOException {
    	byte[] data = null;
    	ByteArrayOutputStream bos = new ByteArrayOutputStream();
    	DataOutputStream dos = new DataOutputStream(bos);
    	dos.writeDouble(num);
    	dos.flush();
    	//获取数据
    	data = bos.toByteArray();
    	dos.close();
    	return data;
    }
}
