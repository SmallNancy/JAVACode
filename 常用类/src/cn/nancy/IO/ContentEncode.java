package cn.nancy.IO;

import java.io.UnsupportedEncodingException;

/**
 *    ����
 * @author Nancy
 *
 */
public class ContentEncode {
	public static void main(String[] args) {
		String s = "���";
		byte[] datas = s.getBytes();
		System.out.println(datas.length);   // Ĭ����Ŀ���뷽ʽ�����4
		
		try {
			datas = s.getBytes("UTF-8");    
			System.out.println(datas.length);  // ���6
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
