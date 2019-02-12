package cn.nancy.ioTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
/**
 * commons.jar 统计文件大小 
 * @author Nancy
 *
 */
public class IOCommonsTest {
	public static void main(String[] args) {
		//文件大小
		long len = FileUtils.sizeOf(new File("src/cn/nancy/ioTest/IOCommonsTest.java"));
		System.out.println(len);
		//目录大小
		len = FileUtils.sizeOf(new File("E:/WorkSpace"));
		System.out.println(len);
	}

}
