package cn.nancy.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo2 {
	public static void main(String[] args) {
		String path = "cn.nancy.test.bean.User";
		try {
			Class clzz = Class.forName(path);
			
			//获取类的名字
			System.out.println(clzz.getName());
			System.out.println(clzz.getSimpleName());
			
			//获取属性信息
			Field[] fs = clzz.getFields();     //只能获取共有的属性
			System.out.println(fs.length);  
			Field[] fields = clzz.getDeclaredFields(); //获取全部已经声明的属性
			System.out.println(fields.length);
			
			//获取方法
			Method[] ms = clzz.getDeclaredMethods();
			for(Method m:ms) {
				System.out.println("方法：" + m);
			}
			
			//获取构造器
			Constructor[] cons =  clzz.getDeclaredConstructors();
			for(Constructor con:cons) {
				System.out.println("构造器：" + con);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
