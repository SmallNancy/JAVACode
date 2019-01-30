package cn.nancy.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestIterator {
  public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		for(Iterator<String> iter = list.iterator();iter.hasNext();) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "nancy");
		map.put(2, "king");
		Set<Entry<Integer, String>> ss = map.entrySet(); // 先获取键的集合
		for(Iterator<Entry<Integer, String>> iter = ss.iterator();iter.hasNext();) {
			Entry<Integer, String> temp = iter.next();
			System.out.println(temp.getKey() +":"+ temp.getValue());
		}
	}
}
