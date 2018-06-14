package TestArray01;


public class Test01 {
	public static void main(String[] args) {
		int[] a = new int[3];
		StringBuilder acd = new StringBuilder();//默认字符串长度16
		StringBuilder acd1 = new StringBuilder("asd");//字符串长度4+16=20
		acd1.append("dggh");
		System.out.println(acd1);
		acd1.delete(1, 3);
		System.out.println(acd1);
		
	}

}
