package cn.nancy.test;

@SuppressWarnings("all")
public class Demo {
  public static void main(String[] args) {
  	String path = "cn.nancy.test.bean.User";
		try {
			//一个类只对应一个class对象
			Class<?> cl = Class.forName(path);
			System.out.println("cl" + cl);
			System.out.println(cl.hashCode());
			
			Class cl2 = String.class;
			System.out.println("cl2" + cl2);
			Class cl3 = path.getClass();
			System.out.println("cl3" + cl3);
			System.out.println(cl2 == cl3);
			
			int[] arr1 = new int[10];
			int[] arr2 = new int[20];
			int[][] arr3 = new int[20][2];
			
			System.out.println(arr1.getClass().hashCode());
			System.out.println(arr2.getClass().hashCode());
			System.out.println(arr3.getClass().hashCode());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
