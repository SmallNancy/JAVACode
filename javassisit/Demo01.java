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
		
		//��������
		CtField f1 = CtField.make("private int empno;", cc);
		CtField f2 = CtField.make("private String ename;", cc);
		cc.addField(f1);
		cc.addField(f2);
		
		//��������
		CtMethod m1 = CtMethod.make("public int getEmpno(){return empno;}",cc);
		CtMethod m2 = CtMethod.make("public void setEmpno(int empno){this.empno = empno;}", cc);
		cc.addMethod(m1);
		cc.addMethod(m2);
		//��ӹ�����
		CtConstructor con = new CtConstructor(new CtClass[] {CtClass.intType,pool.get("java.lang.String")}, cc);
	    con.setBody("{this.empno = empno;this.ename = ename;}");
	    cc.writeFile("E:/WorkSpace/EclipseWorkspace/Poly/src");
	    //�����룬����.class��Դ���ļ�
	    System.out.println("�����࣬�ɹ�");
    }
}
