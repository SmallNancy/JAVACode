package cn.nancy.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 *  ÎÄ¼þ¿½±´
 * @author Nancy
 *
 */
public class CopyFile {
  public static void main(String[] args) {
		copy("aa.png", "acopy.png");
	}
  public static void copy(String srcPath,String descPath) {
  	File src = new File(srcPath);
		File desc = new File(descPath);
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(desc);
			byte[] flush = new byte[1024];
			int len = -1;
			while((len = is.read(flush))!= -1) {
				os.write(flush,0,len);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(is != null) {
					try {
						is.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
  }
}
