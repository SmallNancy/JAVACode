package cn.nancy.IO;

import java.io.File;
import java.io.IOException;

public class TestIO {
  public static void main(String[] args) {
		File src = new File("E:/WorkSpace/EclipseWorkspace/JAVACode/≥£”√¿‡/src/a.txt");
		try {
			src.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
