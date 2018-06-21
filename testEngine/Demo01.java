package test;

import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
/**
 * 测试脚本引擎，执行js代码
 * @author Small
 *
 */
public class Demo01 {
    public static void main(String[] args) throws Exception{
    	//获得脚本引擎对象
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("javascript");
		//ScriptEngine engine = sem.getEngineByName("js");
		
		//定义变量存储到引擎上下文里面
		engine.put("msg","you are a good man");
		String str = "var user = {name:'nancy',age:18,schools:['中南大学','软件学院']};";
		str += "print(user.name);";
		//执行脚本
		engine.eval(str);
		engine.eval("msg = 'sxt is a good school';");
		System.out.println(engine.get("msg"));
		
		System.out.println("==============================");
		//定义函数
		engine.eval("function add(a,b){var sum = a + b;return sum;}");
		//取得调用接口
		Invocable jsInvocable = (Invocable)engine;
		//执行脚本中定义的方法
		Object result = jsInvocable.invokeFunction("add",new Object[]{13,20});
		System.out.println(result);
		
		System.out.println("==============================");
		//导入其他Java包，使用其他包中的Java类
		String jscode = "var list =  java.util.Arrays.asList([\"中南大学\",\"清华大学\",\"csu\"]);";
		engine.eval(jscode);
		List<String> list2 = (List<String>)engine.get("list");
		for(String temp:list2) {
			System.out.println(temp);
		}
	}
}
