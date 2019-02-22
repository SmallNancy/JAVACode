package cn.nancy.netTest;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP：定位一个节点、计算机、路由、通讯设备等
 * @author Nancy
 *
 */
public class IPTest {
  public static void main(String[] args) throws IOException {
  	
  	//使用getLocalHost创建InetAddress对象 本机
		InetAddress ad = InetAddress.getLocalHost();
		System.out.println(ad.getHostAddress());  //获取IP
		System.out.println(ad.getHostName());     //获取计算机名
		
		//使用域名解析IP地址，创建InetAddress对象
		ad = InetAddress.getByName("www.baidu.com");
		System.out.println(ad.getHostAddress());  //获取服务器IP
		System.out.println(ad.getHostName());     //获取网址名
	}
}
