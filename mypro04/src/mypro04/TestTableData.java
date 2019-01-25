package mypro04;

import java.util.Arrays;

/**
 *     数组存储表格数据
 * @author Small
 *
 */
public class TestTableData {
	public static void main(String[] args) {
		Object[] obj1 = {1001,"king",18}; 
		Object[] obj2 = {1002,"nancy",21}; 
		Object[] obj3 = {1003,"zzz",17}; 
		Object[] obj4 = {1004,"pigz",23}; 
		
		Object[][] arr = new Object[4][];
		arr[0] = obj1;
		arr[1] = obj2;
		arr[2] = obj3;
		arr[3] = obj4;
		
		for(Object[] temp:arr) {
			System.out.println(Arrays.toString(temp));
		}
	}

}
