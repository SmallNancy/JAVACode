package regexTest;
/**
 * ������ʽ
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
    	
    	//���ʽ����
		Pattern p = Pattern.compile("\\w+");
		
		//����Matcher����
		Matcher m = p.matcher("adsd2323&&243dfj");
		System.out.println(m.matches());
		System.out.println("----------------");
		//�÷���ɨ����������У��������ģʽƥ�����һ��������
		
		
		while(m.find()) {
			System.out.println(m.group());
		}
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
		
		
	}
}
