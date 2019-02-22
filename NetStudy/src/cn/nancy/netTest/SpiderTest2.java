package cn.nancy.netTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 *ÍøÂçÅÀ³æ +Ä£Äâä¯ÀÀÆ÷
 * @author Nancy
 *
 */
public class SpiderTest2 {
  public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.dianping.com");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
		String msg = null;
		while(null != (msg = br.readLine())) {
			System.out.println(msg);
		}
	}
}
