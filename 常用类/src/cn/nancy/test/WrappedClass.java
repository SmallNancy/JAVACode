package cn.nancy.test;
/**
 *    ���԰�װ��
 * @author Small
 *
 */
public class WrappedClass {
  public static void main(String[] args) {
		//1��������������ת���ɰ�װ��
  	Integer a = new Integer(20);
  	Integer aa = Integer.valueOf(10);
  	//2����װ��ת���ɻ�������
  	int c = a.intValue();
  	double d = aa.doubleValue();
  	//3���ַ���ת�ɰ�װ�����
  	Integer f = Integer.parseInt("999");
  	//4����װ��ת�����ַ���
  	String str = f.toString();
  	
  	
  	Integer age = 13; //Integer a = Integer.valueof(13);�Զ�װ��
  	
  	Integer a1 = 127;
  	Integer a2 = 127;
  	System.out.println(a1 == a2);
  	System.out.println(a1.equals(a2));
  	System.out.println("127===================");
  	Integer b1 = 128;
  	Integer b2 = 128;
  	System.out.println(b1 == b2);
  	System.out.println(b1.equals(b2));
  	System.out.println("128===================");
	}
}
