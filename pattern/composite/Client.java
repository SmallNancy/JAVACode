package composite;
/**
 * 树形结构用组合模式
 * 使用组合模式，进行文件查杀
 * 递归
 * @author Small
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4;
		Folder f1 = new Folder("我的收藏");
		f2 = new ImageFile("pic.jpg");
		f3 = new TextFile("Hello.txt");
		f1.add(f2);
		f1.add(f3);
		
		Folder file = new Folder("电影");
		f4 = new VideoFile("笑傲江湖.avi");
		file.add(f4);
		f1.add(file);
		f1.killVirus();
		//f2.killVirus();
	}

}
