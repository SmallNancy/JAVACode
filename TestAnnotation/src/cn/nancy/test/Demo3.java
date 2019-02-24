package cn.nancy.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import cn.nancy.test.bean.User;

@SuppressWarnings("all")
public class Demo3 {
  public static void main(String[] args) {
  	String path = "cn.nancy.test.bean.User";
  	//ͨ������API���ù��췽������������
  	try {
			Class clzz = Class.forName(path);
			User user = (User)clzz.newInstance();  //�����޲ι�����
			System.out.println(user);
			//����������
			Constructor<User> c = clzz.getDeclaredConstructor(int.class,String.class,int.class);
			User u = c.newInstance(01,"nancy",20);
			System.out.println(u.getName());
			//��������
			Method m = clzz.getDeclaredMethod("setName", String.class);
			m.invoke(u, "zmt");
			System.out.println(u.getName());
			//��������
			Field f = clzz.getDeclaredField("name");
			
			//setAccessible ���úͽ��ð�ȫ���Ŀ���
			f.setAccessible(true);     // ͨ�����䣬�����޸�˽������
			f.set(u, "pig");
			System.out.println(u.getName());
			System.out.println(f.get(u));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
