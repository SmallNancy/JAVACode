package testJavassist;

import java.io.IOException;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;

public class Demo01 {
    public static void main(String[] args) throws Exception  {
		ClassPool pool = ClassPool.getDefault();
		CtClass cc = pool.makeClass("testjavassist.Emp");
		
		//创建属性
		CtField f1 = CtField.make("private int empno;", cc);
		CtField f2 = CtField.make("private String ename;", cc);
		cc.addField(f1);
		cc.addField(f2);
		
		//创建方法
		CtMethod m1 = CtMethod.make("public int getEmpno(){return empno;}",cc);
		CtMethod m2 = CtMethod.make("public void setEmpno(int empno){this.empno = empno;}", cc);
		cc.addMethod(m1);
		cc.addMethod(m2);
		//添加构造器
		CtConstructor con = new CtConstructor(new CtClass[] {CtClass.intType,pool.get("java.lang.String")}, cc);
	    con.setBody("{this.empno = empno;this.ename = ename;}");
	    cc.writeFile("E:/WorkSpace/EclipseWorkspace/Poly/src");
	    //反编译，生成.class的源码文件
	    System.out.println("生成类，成功");
    }
}
