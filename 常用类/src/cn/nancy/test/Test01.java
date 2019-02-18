package cn.nancy.test;

import java.util.HashMap;

public class Test01 {
	public static int maxlen(int[] arr,int k) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int len = 0;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(map.containsKey(sum - k)) {
				len = Math.max(i - map.get(sum - k), len);
			}
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		return len;
	}

}
