package netIp;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws MalformedURLException {
		URL u1 = new URL("http://www.baidu.com:80/index.html#aa?uname=nancy");
		System.out.println("����"+u1.getHost());
		System.out.println("Э��"+u1.getProtocol());
		System.out.println("�˿�"+u1.getPort());
		System.out.println("��Դ"+u1.getFile());
		System.out.println("���·����"+u1.getPath());
		System.out.println("ê��:"+u1.getRef());
		u1 = new URL("http://www.baidu.com:80/a/");
		u1 = new URL(u1,"b.txt");
		System.out.println(u1.toString());
		
	}

}
