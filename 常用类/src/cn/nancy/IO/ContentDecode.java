package cn.nancy.IO;

import java.io.UnsupportedEncodingException;

/**
 * ����
 * 
 * ���룺�ֽ����������ַ�����ͳһ
 * @author Nancy
 *
 */
public class ContentDecode {
  public static void main(String[] args) {
		String str = "��ã�2019�ꡣ";                                   // �ҵĹ���Ĭ��GBK����
		byte[] datas = str.getBytes();
		try {
			String decode = new String(datas, "GBK");
			System.out.println(decode);
			
			String d = new String(datas, 0, datas.length - 3, "GBK");  // �ֽ�������
			System.out.println(d);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
