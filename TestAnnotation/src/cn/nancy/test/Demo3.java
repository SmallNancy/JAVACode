package cn.nancy.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import cn.nancy.test.bean.User;

@SuppressWarnings("all")
public class Demo3 {
  public static void main(String[] args) {
  	String path = "cn.nancy.test.bean.User";
  	//通过反射API调用构造方法，创建对象
  	try {
			Class clzz = Class.forName(path);
			User user = (User)clzz.newInstance();  //调用无参构造器
			System.out.println(user);
			//操作构造器
			Constructor<User> c = clzz.getDeclaredConstructor(int.class,String.class,int.class);
			User u = c.newInstance(01,"nancy",20);
			System.out.println(u.getName());
			//操作方法
			Method m = clzz.getDeclaredMethod("setName", String.class);
			m.invoke(u, "zmt");
			System.out.println(u.getName());
			//操作属性
			Field f = clzz.getDeclaredField("name");
			
			//setAccessible 启用和禁用安全检查的开关
			f.setAccessible(true);     // 通过反射，可以修改私有属性
			f.set(u, "pig");
			System.out.println(u.getName());
			System.out.println(f.get(u));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
