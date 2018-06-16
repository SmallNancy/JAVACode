package cn.nancy.IOFile;
/**
 * ���ļ������ļ���
 * isDirectory() 
 * isFile()
 * �Ƿ�Ϊ����·��isAbsolute()
 * ��ȡ�ļ����ֽ���.length()
 * �����ļ�createNewFile()
 *������ʱ�ļ�createTempFile
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
		//������ϵ
		System.out.println("�ļ��Ƿ����:"+src.exists());
		System.out.println("�ļ��Ƿ��д��"+src.canWrite());
		
		if (src.isFile()) {
			System.out.println("�ļ�");
		}else {
			System.out.println("�ļ���");
		}
		
		System.out.println("�Ƿ�Ϊ����·����"+src.isAbsolute());
		System.out.println(src.length());
	}
	//����ɾ���ļ�
	public static void test2() throws IOException {
		String  path = "D:/important/2.txt";
		File src = new File(path);
		if (!src.exists()) {
			try {
				boolean flag = src.createNewFile();
				System.out.println(flag?"�����ɹ�":"����ʧ��");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//ɾ���ļ�
		boolean flag = src.delete();
		System.out.println(flag?"ɾ���ɹ�":"ɾ��ʧ��");
		
		//������ʱ�ļ�
		File temp = File.createTempFile("tes", ".temp", new File("D:/important/"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		temp.deleteOnExit();//�˳���ɾ��
	}
	
	

}
