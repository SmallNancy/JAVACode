package mypro04;

import java.util.Arrays;
/**
 *BinarySearch折半查找，必须有序
 *     返回索引
 * @author Small
 *
 */
public class BinarySearch {
  public static void main(String[] args) {
		int[] arr = {2,3,9,1,6,4};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binary(arr, 3));
		
	}
  public static int binary(int[] arr,int value) {
  	int low = 0;
  	int high = arr.length - 1;
  	while(low <= high) {
  		int mid = (low + high)/2;
  		if(arr[mid] == value) {
  			return mid;
  		}else if(arr[mid] > value) {
  			high = mid -1;
  		}else {
  			low = mid + 1;
  		}
  	}
  	return -1;
  }
}
