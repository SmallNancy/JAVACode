package netIp;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws MalformedURLException {
		URL u1 = new URL("http://www.baidu.com:80/index.html#aa?uname=nancy");
		System.out.println("域名"+u1.getHost());
		System.out.println("协议"+u1.getProtocol());
		System.out.println("端口"+u1.getPort());
		System.out.println("资源"+u1.getFile());
		System.out.println("相对路径："+u1.getPath());
		System.out.println("锚点:"+u1.getRef());
		u1 = new URL("http://www.baidu.com:80/a/");
		u1 = new URL(u1,"b.txt");
		System.out.println(u1.toString());
		
	}

}
