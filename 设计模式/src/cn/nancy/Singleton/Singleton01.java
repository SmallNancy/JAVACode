package cn.nancy.Singleton;
/**
 * ����ʽ����ģʽ
 * �̰߳�ȫ��Ч�ʸߣ������ӳټ���
 * @author Small
 *
 */
public class Singleton01 {
  private static Singleton01 single = new Singleton01();  // ����˽�л�
  
  private Singleton01() {                                 // ������˽��
  	
  }
  
  public static Singleton01 instance() {                  // ȫ�ַ��ʵ㹲��
  	return single;
  }
}
