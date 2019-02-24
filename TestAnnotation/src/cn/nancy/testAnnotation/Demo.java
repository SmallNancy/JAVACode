package cn.nancy.testAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
/**
 * 利用反射读取注解信息，模拟处理信息流程
 * @author Nancy
 *
 */
public class Demo {
	public static void main(String[] args) {
			Class cl;
			try {
			//获得类的所有有效注解
				cl = Class.forName("cn.nancy.testAnnotation.Student");
				Annotation[] anno = cl.getAnnotations();
				
				for(Annotation a : anno) {
					System.out.println(a);
				}
				
			  //获得类指定的注解
				Table t = (Table)cl.getAnnotation(Table.class);
				System.out.println(t.value());
				
		   	//获得属性的注解
				Field f = cl.getDeclaredField("age");
				SFiled sf = f.getAnnotation(SFiled.class);
				System.out.println(sf.columnName() + " " + sf.type() + " " + sf.length());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}
}
