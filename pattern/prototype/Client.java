package prototype;
import java.util.Date;
/**
 * 测试原型模型（浅克隆）
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) throws Exception {
    	Date d = new Date(123123123L);
		Sheep s1 = new Sheep("绵阳",d);
		Sheep s2 =(Sheep) s1.clone();
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
