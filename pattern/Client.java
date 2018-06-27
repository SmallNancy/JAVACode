package singleton;

public class Client {
    public static void main(String[] args) {
		SingleDemo s1 = SingleDemo.getInstance();
		SingleDemo s2 = SingleDemo.getInstance();
		
		SingleDemo2 s3 = SingleDemo2.getInstance();
		SingleDemo2 s4 = SingleDemo2.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("--------------------------");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("---------------------------");
		System.out.println(SingleDemo4.INSTANCE ==SingleDemo4.INSTANCE);
	}
}
