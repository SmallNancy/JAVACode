package cn.nancy.IOFile;
/**
 * 是文件还是文件夹
 * isDirectory() 
 * isFile()
 * 是否为绝对路径isAbsolute()
 * 读取文件的字节数.length()
 * 创建文件createNewFile()
 *创建临时文件createTempFile
 */
import java.io.File;
import java.io.IOException;

public class LinkFile {
	public static void main(String[] args) {
		test1();
		try {
			test2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test1() {
		String  path = "D:/important/hello.txt";
		File src = new File(path);
		//建立联系
		System.out.println("文件是否存在:"+src.exists());
		System.out.println("文件是否可写："+src.canWrite());
		
		if (src.isFile()) {
			System.out.println("文件");
		}else {
			System.out.println("文件夹");
		}
		
		System.out.println("是否为绝对路径："+src.isAbsolute());
		System.out.println(src.length());
	}
	//创建删除文件
	public static void test2() throws IOException {
		String  path = "D:/important/2.txt";
		File src = new File(path);
		if (!src.exists()) {
			try {
				boolean flag = src.createNewFile();
				System.out.println(flag?"创建成功":"创建失败");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//删除文件
		boolean flag = src.delete();
		System.out.println(flag?"删除成功":"删除失败");
		
		//创建临时文件
		File temp = File.createTempFile("tes", ".temp", new File("D:/important/"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		temp.deleteOnExit();//退出即删除
	}
	
	

}
