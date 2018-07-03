package composite;

import java.util.ArrayList;
import java.util.List;

//���󹹽�
public interface AbstractFile {
    void killVirus();  //ɱ��
}

class ImageFile implements AbstractFile{
    private String name;
    
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---ͼƬ�ļ���" + name + ",��ɱ");
		
	}
	
}

class TextFile implements AbstractFile{
    private String name;
    
	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---�ı��ļ���" + name + ",��ɱ");
		
	}
	
}

class VideoFile implements AbstractFile{
    private String name;
    
	public VideoFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("---��Ƶ�ļ���" + name + ",��ɱ");
		
	}
	
}

class Folder implements AbstractFile{
    private String name;
    //��������������������������µ��ӽڵ�
    private List<AbstractFile> list = new ArrayList();
    
	public Folder(String name) {
		super();
		this.name = name;
	}
    public void add(AbstractFile file) {
    	list.add(file);
    }
    public void remove(AbstractFile file) {
    	list.remove(file);
    }
    public AbstractFile getChild(int index) {
    	return list.get(index);
    }

	@Override
	public void killVirus() {
		System.out.println("----�ļ���" + name + ",��ɱ");
		for(AbstractFile file:list) {
			file.killVirus();  //�ݹ�
		}
	}
	
}