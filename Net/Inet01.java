package netIp;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * 没有封装端口
 * @author nancy
 *
 */
public class Inet01 {
    public static void main(String[] args) throws UnknownHostException {
    	//getLocalHost方法创建对象
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());//返回IP192.168.1.101
        System.out.println(addr.getHostName());//返回主机名称DESKTOP-G90017A
        //根据域名得到InetAddress对象
        addr = InetAddress.getByName("www.baidu.com");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());//返回www.baidu.com
      //根据IP得到InetAddress对象
        addr = InetAddress.getByName("119.75.213.61");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());//返回ip
	}
}
