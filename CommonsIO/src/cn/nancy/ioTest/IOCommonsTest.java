package cn.nancy.ioTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
/**
 * commons.jar ͳ���ļ���С 
 * @author Nancy
 *
 */
public class IOCommonsTest {
	public static void main(String[] args) {
		//�ļ���С
		long len = FileUtils.sizeOf(new File("src/cn/nancy/ioTest/IOCommonsTest.java"));
		System.out.println(len);
		//Ŀ¼��С
		len = FileUtils.sizeOf(new File("E:/WorkSpace"));
		System.out.println(len);
	}

}
