package regexTest;
/**
 * 正则表达式
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
    	
    	//表达式对象
		Pattern p = Pattern.compile("\\w+");
		
		//创建Matcher对象
		Matcher m = p.matcher("adsd2323&&243dfj");
		System.out.println(m.matches());
		System.out.println("----------------");
		//该方法扫面输入的序列，查找与该模式匹配的下一个子序列
		
		
		while(m.find()) {
			System.out.println(m.group());
		}
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
		
		
	}
}
