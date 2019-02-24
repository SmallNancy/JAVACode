package cn.nancy.proxy;
/**
 *   静态代理
 *   公共接口  真实角色  代理角色
 * @author Nancy
 *
 */
public class StaticProxy {
  public static void main(String[] args) {
		new proxy1(new You()).marry();
		//new Thread(线程对象).start();
	}
}

//公共接口
interface wedding{
	void marry();
}
//真实角色
class You implements wedding{
	@Override
	public void marry() {
		System.out.println("wedding today");
	}
	
}
//代理角色
class proxy1 implements wedding{
  private wedding target;
	public proxy1(wedding target) {
		super();
		this.target = target;
	}

	@Override
	public void marry() {
	  read();
		this.target.marry();
		end();
	}
	public void read() {
		System.out.println("婚礼筹备");
	}
  public void end() {
		System.out.println("结束。。。。");
	}
	
}
