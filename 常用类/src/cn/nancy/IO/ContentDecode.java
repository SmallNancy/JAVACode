package cn.nancy.IO;

import java.io.UnsupportedEncodingException;

/**
 * 解码
 * 
 * 乱码：字节数不够，字符集不统一
 * @author Nancy
 *
 */
public class ContentDecode {
  public static void main(String[] args) {
		String str = "你好，2019年。";                                   // 我的工程默认GBK编码
		byte[] datas = str.getBytes();
		try {
			String decode = new String(datas, "GBK");
			System.out.println(decode);
			
			String d = new String(datas, 0, datas.length - 3, "GBK");  // 字节数不够
			System.out.println(d);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
