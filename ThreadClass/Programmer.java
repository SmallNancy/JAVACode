package cn.nancy.threadCreate;
/**
 * 使用Runnable接口
 * 1.类  实现Runnable 接口  重写run方法
 * 2. 启动多线程 使用静态代理
 *    1）创建真实角色
 *    2）创建代理角色+真实角色引用
 *    3）调用start方法  启动线程
 * @author Small
 *
 */
public class Programmer implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++) {
			System.out.println("一边敲代码");
		}
	}

}
