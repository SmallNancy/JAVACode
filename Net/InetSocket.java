package netIp;

import java.net.InetSocketAddress;

/**
 * ��װ�˿� InetAddress+�˿�
 * @author Z.M.T
 *
 */
public class InetSocket {
	public static void main(String[] args) {
		InetSocketAddress address = new InetSocketAddress("192.168.1.101", 80);
		System.out.println(address.getAddress());
		System.out.println(address.getHostName());
		System.out.println(address.getPort());
	}

}
