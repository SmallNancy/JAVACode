package cn.nancy.test;

import java.util.Map;
import java.util.TreeMap;
/**
 * TreeMap 
 *     按照薪水从小到大排重写Comparable的compareTo方法
 * @author Small
 *
 */
public class TestTreeMap {
  public static void main(String[] args) {
		Map<Emp, String> map = new TreeMap<Emp, String>();
		Emp emp1 = new Emp(01,"zzz", 5000);
		Emp emp2 = new Emp(06,"qqq", 4500);
		Emp emp3 = new Emp(03,"bbb", 5000);
		Emp emp4 = new Emp(02,"hhh", 7000);
		map.put(emp1, "真好");
		map.put(emp2, "hell");
		map.put(emp3, "还行");
		map.put(emp4, "greatl");
		for(Emp key:map.keySet()) {
			System.out.println(key + "---" + map.get(key));
		}
	}
}

class Emp implements Comparable<Emp>{
	int id;
	String name;
	double salary;
	
	public Emp(int id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "id:" + id + " name:" + name + " salary" + salary;
	}

	@Override
	public int compareTo(Emp o) {
		if(this.salary > o.salary) {
			return 1;
		}else if(this.salary < o.salary) {
			return -1;
		}else {
			if(this.id > o.id) {
				return 1;
			}else if(this.id < o.id) {
				return -1;
			}else {
				return 0;
			}
		}
	}
}