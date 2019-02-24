package cn.nancy.proxy;
/**
 *   ��̬����
 *   �����ӿ�  ��ʵ��ɫ  �����ɫ
 * @author Nancy
 *
 */
public class StaticProxy {
  public static void main(String[] args) {
		new proxy1(new You()).marry();
		//new Thread(�̶߳���).start();
	}
}

//�����ӿ�
interface wedding{
	void marry();
}
//��ʵ��ɫ
class You implements wedding{
	@Override
	public void marry() {
		System.out.println("wedding today");
	}
	
}
//�����ɫ
class proxy1 implements wedding{
  private wedding target;
	public proxy1(wedding target) {
		super();
		this.target = target;
	}

	@Override
	public void marry() {
	  read();
		this.target.marry();
		end();
	}
	public void read() {
		System.out.println("����ﱸ");
	}
  public void end() {
		System.out.println("������������");
	}
	
}
