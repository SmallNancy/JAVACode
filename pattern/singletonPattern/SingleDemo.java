package singleton;
/**
 * ���Զ���ʽ����ģʽ
 * ������ʱ����Ȼ���̰߳�ȫ
 * @author small
 *
 */
public class SingleDemo {
	//�ṩ��̬����,���ʼ��ʱ���������ش˶���
	 private static SingleDemo instance = new SingleDemo();
    //˽�й�����
	 private SingleDemo() {
		 
	 }
	 //����û��ͬ��������Ч�ʸ�
	 public static SingleDemo getInstance() {
		 return instance;
	 }
}
