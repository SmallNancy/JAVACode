package cn.nancy.IO;

import java.io.File;
/**
 *      ͳ���ļ���С
 * @author Small
 *
 */
public class DirCount {
	private String path;   //�ļ�·��
	private File src;      //Դ
  private static long len;      //�ļ���С
  
  //������
  public DirCount(String path) {
  	this.path = path;
  	this.src = new File(path);
  	Count(src);
  }

  public long getLen() {
  	return len;
  }
  
  public static void Count(File src) {
  	if(src.exists() && src != null) {
  		if(src.isFile()) {
  			len += src.length();
  		}else {
				for(File s: src.listFiles()) {
					Count(s);
				}
			}
  	}
  }
  
  
  public static void main(String[] args) {
  	DirCount dc = new DirCount("E:/����/");
  	System.out.println(dc.getLen());
	}
  
  
}
