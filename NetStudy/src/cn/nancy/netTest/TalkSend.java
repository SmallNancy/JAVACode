package cn.nancy.netTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 发送端：使用面向对象
 * @author Nancy
 *
 */
public class TalkSend implements Runnable{
	private DatagramSocket client;
	private BufferedReader read;
	private int Toport;
	private String toIp;
	public TalkSend(int port,String toIp,int Toport) {
		this.toIp = toIp;
		this.Toport = Toport;
		try {
			client = new DatagramSocket(port);
			read = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while(true) {
			try {
				String data = read.readLine();
				byte[] datas = data.getBytes();
				DatagramPacket packet = new DatagramPacket(datas, 0, datas.length,
						new InetSocketAddress(this.toIp, this.Toport));
				client.send(packet);
				if(data.equals("bye")) {
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		client.close();
	}
 
}
