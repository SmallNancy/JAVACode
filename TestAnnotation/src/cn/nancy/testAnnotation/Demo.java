package cn.nancy.testAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
/**
 * ���÷����ȡע����Ϣ��ģ�⴦����Ϣ����
 * @author Nancy
 *
 */
public class Demo {
	public static void main(String[] args) {
			Class cl;
			try {
			//������������Чע��
				cl = Class.forName("cn.nancy.testAnnotation.Student");
				Annotation[] anno = cl.getAnnotations();
				
				for(Annotation a : anno) {
					System.out.println(a);
				}
				
			  //�����ָ����ע��
				Table t = (Table)cl.getAnnotation(Table.class);
				System.out.println(t.value());
				
		   	//������Ե�ע��
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
