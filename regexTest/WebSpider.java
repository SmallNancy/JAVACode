package regexTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网络爬虫取链接
 * @author Small
 *
 */
public class WebSpider {
	/**
	 * 获得urlstr对应的网页源码的内容
	 * @param urlstr
	 * @return
	 */
	public static String getURLContent(String urlstr) {
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL(urlstr);
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String temp = "";
			while((temp=reader.readLine())!=null) {
				sb.append(temp);
			}
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	//正则匹配
	public static void main(String[] args) {
		String s = getURLContent("http://www.163.com/");
		System.out.println(s);
		Pattern p = Pattern.compile("<a[\\s\\S]+?</a>");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}
