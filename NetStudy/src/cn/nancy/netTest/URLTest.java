package cn.nancy.netTest;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
  public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.baudu.com:80/index.html?uname=nancy#a");
		System.out.println("Э��:" + url.getProtocol());
		System.out.println("�˿ںţ�" + url.getPort());
		System.out.println("������Դ��" + url.getFile());
		System.out.println("ê�㣺" + url.getRef());
	}
}
