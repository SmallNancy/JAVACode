package composite;
/**
 * ���νṹ�����ģʽ
 * ʹ�����ģʽ�������ļ���ɱ
 * �ݹ�
 * @author Small
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4;
		Folder f1 = new Folder("�ҵ��ղ�");
		f2 = new ImageFile("pic.jpg");
		f3 = new TextFile("Hello.txt");
		f1.add(f2);
		f1.add(f3);
		
		Folder file = new Folder("��Ӱ");
		f4 = new VideoFile("Ц������.avi");
		file.add(f4);
		f1.add(file);
		f1.killVirus();
		//f2.killVirus();
	}

}
