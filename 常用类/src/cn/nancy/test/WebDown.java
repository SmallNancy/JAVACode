package cn.nancy.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
/**
 *   œ¬‘ÿ
 * @author Nancy
 *
 */
public class WebDown {
  public  void downLoad(String url,String name) {
  	try {
			FileUtils.copyURLToFile(new URL(url), new File(name));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("œ¬‘ÿ ß∞‹");
		}
  }
}
