package mypro04;

import java.util.Arrays;

/**
 *      √∞≈›≈≈–Ú
 * @author Small
 *
 */
public class BubbleSort {
  public static void main(String[] args) {
		int[] arr = {34,21,56,1,5,10};
		System.out.println(Arrays.toString(arr));
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
  public static void bubble(int[] arr) {
  	for(int i = 0;i < arr.length - 1;i++) {
  		int flag = 0;
  		for(int j = 0;j < arr.length - i - 1;j++) {
  			if(arr[j] > arr[j+1]) {
  				int temp = arr[j];
  				arr[j] = arr[j+1];
  				arr[j+1] = temp;
  				flag = 1;
  			}
  		}
  		if(flag == 0) {
  			break;
  		}
  		System.out.println(Arrays.toString(arr));
  	}
  	System.out.println("====================");
  }
  
//  public static void sort(int[] arr) {
//  	for(int i = 0;i < arr.length - 1;i++) {
//  		int flag = 0;
//  		for(int j = 0;j < arr.length - i - 1;j++) {
//  			if(arr[j] > arr[j+1]) {
//  				int temp = arr[j];
//  				arr[j] = arr[j+1];
//  				arr[j+1] = temp;
//  				flag = 1;
//  			}
//  		}
//  		if(flag == 0) {
//  			break;
//  		}
//  	}
//  }
}
