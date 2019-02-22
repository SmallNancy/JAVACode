package cn.nancy.netTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
/**
 * ºÚµ•≈¿≥Ê‘≠¿Ì
 * @author Nancy
 *
 */
public class SpiderTest {
  public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.jd.com");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		String str = null;
		while(null != (str = br.readLine())) {
			System.out.println(str);
		}
	}
}
