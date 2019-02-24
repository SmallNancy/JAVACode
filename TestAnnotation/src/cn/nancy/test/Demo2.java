package cn.nancy.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo2 {
	public static void main(String[] args) {
		String path = "cn.nancy.test.bean.User";
		try {
			Class clzz = Class.forName(path);
			
			//��ȡ�������
			System.out.println(clzz.getName());
			System.out.println(clzz.getSimpleName());
			
			//��ȡ������Ϣ
			Field[] fs = clzz.getFields();     //ֻ�ܻ�ȡ���е�����
			System.out.println(fs.length);  
			Field[] fields = clzz.getDeclaredFields(); //��ȡȫ���Ѿ�����������
			System.out.println(fields.length);
			
			//��ȡ����
			Method[] ms = clzz.getDeclaredMethods();
			for(Method m:ms) {
				System.out.println("������" + m);
			}
			
			//��ȡ������
			Constructor[] cons =  clzz.getDeclaredConstructors();
			for(Constructor con:cons) {
				System.out.println("��������" + con);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
