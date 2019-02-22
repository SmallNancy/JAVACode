package cn.nancy.netTest;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
  public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.baudu.com:80/index.html?uname=nancy#a");
		System.out.println("协议:" + url.getProtocol());
		System.out.println("端口号：" + url.getPort());
		System.out.println("请求资源：" + url.getFile());
		System.out.println("锚点：" + url.getRef());
	}
}
