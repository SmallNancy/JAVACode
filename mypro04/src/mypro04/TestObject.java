package mypro04;
/**
 * object类
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
	  return getClass().getName() + "@测试重写" + Integer.toHexString(hashCode());
  }
  
  /**
   *      判断地址是否相同
   */
  @Override
  public boolean equals(Object obj) {
      return (this == obj);
  }
}
