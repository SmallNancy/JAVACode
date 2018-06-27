package singleton;
/**
 * ���Ծ�̬�ڲ���ʵ�ַ�ʽ�ĵ���ģʽ
 * ������ʱ����Ȼ���̰߳�ȫ,����Ч�ʸߣ�Ҳ�ӳټ���
 * ����
 * @author small
 *
 */
public class SingleDemo3 {
	private static class SingletonClassInstance{
		 private static final SingleDemo3 instance = new SingleDemo3();
	}
	
    //˽�й�����
	 private SingleDemo3() {
		 
	 }
	 //����û��ͬ��������Ч�ʸ�
	 public static SingleDemo3 getInstance() {
		 return SingletonClassInstance.instance;
	 }
}
