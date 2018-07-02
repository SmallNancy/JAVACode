package prototype;

import java.util.Date;
/**
 * 测试原型模型深复制
 * @author Small
 *
 */
public class Client2 {
    public static void main(String[] args) throws Exception {
    	Date d = new Date(123123123L);
		Sheep2 s1 = new Sheep2("绵阳",d);
		Sheep2 s2 =(Sheep2) s1.clone();
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		d.setTime(234523345465L);
		System.out.println(s1.getBirthday());
		
		
		
		
		s2.setSname("多莉");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
