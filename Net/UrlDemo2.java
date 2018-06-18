package netIp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;

public class UrlDemo2 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.baidu.com");
		
		//获取资源网络流，有乱码
		/**
		 //InputStream is =url.openStream();
		
		byte[] flush = new byte[1024];
		int len = 0;
		while(-1 != (len=is.read(flush))) {
			System.out.println(new String(flush,0,len));
		}
		is.close();
		 */
		//输入缓冲流
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
		//输出缓冲流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"UTF-8"));
		String msg = null;
		while(null!=(msg=br.readLine())) {
			//System.out.println(msg);
			bw.append(msg);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
