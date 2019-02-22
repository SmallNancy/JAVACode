package cn.nancy.netTest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP����λһ���ڵ㡢�������·�ɡ�ͨѶ�豸��
 * @author Nancy
 *
 */
public class IPTest {
  public static void main(String[] args) throws IOException {
  	
  	//ʹ��getLocalHost����InetAddress���� ����
		InetAddress ad = InetAddress.getLocalHost();
		System.out.println(ad.getHostAddress());  //��ȡIP
		System.out.println(ad.getHostName());     //��ȡ�������
		
		//ʹ����������IP��ַ������InetAddress����
		ad = InetAddress.getByName("www.baidu.com");
		System.out.println(ad.getHostAddress());  //��ȡ������IP
		System.out.println(ad.getHostName());     //��ȡ��ַ��
	}
}
