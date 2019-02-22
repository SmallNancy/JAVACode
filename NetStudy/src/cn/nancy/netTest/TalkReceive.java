package cn.nancy.netTest;
/**
 * Ω” ’∂À
 * @author Nancy
 *
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable{
  private DatagramSocket server;
  public TalkReceive(int port) {
  	try {
			server = new DatagramSocket(port);
		} catch (SocketException e) {
			e.printStackTrace();
		}
  }
	@Override
	public void run() {
		while(true) {
			byte[] contains = new byte[1024 * 60];
			DatagramPacket packet = new DatagramPacket(contains, 0,contains.length);
			try {
				server.receive(packet);
				byte[] datas = packet.getData();
				int len = packet.getLength();
				String data = new String(datas, 0, len);
				System.out.println(data);
				if(data.equals("bye")) {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		server.close();
	}
}
