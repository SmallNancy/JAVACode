package cn.nancy.threadCreate;
/**
 * ��̬�������ģʽ
 * 1.��ʵ��ɫ
 * 2.�����ɫ��������ʵ��ɫ������
 * 3.����ʵ����ͬ�Ľӿ�
 * @author Small
 *
 */
public class StaticProxy {
	public static void main(String[] args) {
		//��ʵ��ɫ
		You you = new You();
		//�����ɫ
		Wedding me = new Wedding(you);
		me.Marry();
	}

}
//�ӿ�
interface Marry{
	public abstract void Marry();
}
//��ʵ����
class You implements Marry{

	public void Marry() {
		// TODO Auto-generated method stub
		
	}
	
}
//�����ɫ
class Wedding implements Marry{
	private Marry you;
	public Wedding() {
		System.out.println(you+ "me ���");
	}
	public Wedding(Marry you) {
		this.you = you;
		System.out.println(you+ "me ���");
	}
	public void before() {
		System.out.println("���û鷿");
	}
	public void after() {
		System.out.println("��������ҹ");
	}


	public void Marry() {
		// TODO Auto-generated method stub
		before();
		you.Marry();
		after();
		
	}
	
}
