package netIp;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * û�з�װ�˿�
 * @author nancy
 *
 */
public class Inet01 {
    public static void main(String[] args) throws UnknownHostException {
    	//getLocalHost������������
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());//����IP192.168.1.101
        System.out.println(addr.getHostName());//������������DESKTOP-G90017A
        //���������õ�InetAddress����
        addr = InetAddress.getByName("www.baidu.com");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());//����www.baidu.com
      //����IP�õ�InetAddress����
        addr = InetAddress.getByName("119.75.213.61");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());//����ip
	}
}
