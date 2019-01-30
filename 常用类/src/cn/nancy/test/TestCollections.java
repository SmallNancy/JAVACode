package cn.nancy.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Collections������
 * @author Small
 *
 */
public class TestCollections {
  public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i = 0;i < 10;i++) {
			list.add("list0" + i);
		}
		
		System.out.println(list);
		
		Collections.shuffle(list);    //ϴ��
		System.out.println(list);
		
		Collections.reverse(list);    //����
		System.out.println(list);
		
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "list03"));
	}
}
