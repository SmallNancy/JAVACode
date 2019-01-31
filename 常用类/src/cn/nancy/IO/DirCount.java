package cn.nancy.IO;

import java.io.File;
/**
 *      统计文件大小
 * @author Small
 *
 */
public class DirCount {
	private String path;   //文件路径
	private File src;      //源
  private static long len;      //文件大小
  
  //构造器
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
  	DirCount dc = new DirCount("E:/简历/");
  	System.out.println(dc.getLen());
	}
  
  
}
