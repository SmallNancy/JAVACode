package test;

import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
/**
 * ���Խű����棬ִ��js����
 * @author Small
 *
 */
public class Demo01 {
    public static void main(String[] args) throws Exception{
    	//��ýű��������
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("javascript");
		//ScriptEngine engine = sem.getEngineByName("js");
		
		//��������洢����������������
		engine.put("msg","you are a good man");
		String str = "var user = {name:'nancy',age:18,schools:['���ϴ�ѧ','���ѧԺ']};";
		str += "print(user.name);";
		//ִ�нű�
		engine.eval(str);
		engine.eval("msg = 'sxt is a good school';");
		System.out.println(engine.get("msg"));
		
		System.out.println("==============================");
		//���庯��
		engine.eval("function add(a,b){var sum = a + b;return sum;}");
		//ȡ�õ��ýӿ�
		Invocable jsInvocable = (Invocable)engine;
		//ִ�нű��ж���ķ���
		Object result = jsInvocable.invokeFunction("add",new Object[]{13,20});
		System.out.println(result);
		
		System.out.println("==============================");
		//��������Java����ʹ���������е�Java��
		String jscode = "var list =  java.util.Arrays.asList([\"���ϴ�ѧ\",\"�廪��ѧ\",\"csu\"]);";
		engine.eval(jscode);
		List<String> list2 = (List<String>)engine.get("list");
		for(String temp:list2) {
			System.out.println(temp);
		}
	}
}
