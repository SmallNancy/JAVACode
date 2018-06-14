package TestArray01;

public class ExampleSort {
	public static void sort(Comparable a) {
		
	}
	private static boolean less(Comparable v,Comparable w) {
		return v.compareTo(w) < 0;
	}
	private static void exch(Comparable[] a,int i,int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void show(Comparable[] a) {
		//单行中打印数组
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static boolean isSorted(Comparable[] a) {
		for(int i=1;i<a.length;i++)
			if(less(a[i], a[i-1]))
				return false;
		return true;
	}
	public static void main(String[] args) {
		
	}

}
