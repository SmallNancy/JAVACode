package mypro04;
/**
 * object��
 * @author Small
 *
 */
public class TestObject {
  public static void main(String[] args) {
	TestObject tO = new TestObject();
	System.out.println(tO.toString());
	tO.equals(tO);
	String str1 = new String("hello");
	String str2 = new String("hello");
	System.out.println(str1 == str2);      //false
	System.out.println(str1.equals(str2)); //true
  
  }
  
  @Override
  public String toString() {
	  return getClass().getName() + "@������д" + Integer.toHexString(hashCode());
  }
  
  /**
   *      �жϵ�ַ�Ƿ���ͬ
   */
  @Override
  public boolean equals(Object obj) {
      return (this == obj);
  }
}
