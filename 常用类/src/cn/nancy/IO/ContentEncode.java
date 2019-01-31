package cn.nancy.IO;

import java.io.UnsupportedEncodingException;

/**
 *    编码
 * @author Nancy
 *
 */
public class ContentEncode {
	public static void main(String[] args) {
		String s = "你好";
		byte[] datas = s.getBytes();
		System.out.println(datas.length);   // 默认项目编码方式，输出4
		
		try {
			datas = s.getBytes("UTF-8");    
			System.out.println(datas.length);  // 输出6
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
