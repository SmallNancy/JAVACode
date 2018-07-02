package prototype;
import java.util.Date;
/**
 * ����ԭ��ģ�ͣ�ǳ��¡��
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) throws Exception {
    	Date d = new Date(123123123L);
		Sheep s1 = new Sheep("����",d);
		Sheep s2 =(Sheep) s1.clone();
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		d.setTime(234523345465L);
		System.out.println(s1.getBirthday());
		
		
		s2.setSname("����");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
