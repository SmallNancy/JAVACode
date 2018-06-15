package cn.nancy.threadCreate;
/**
 * 静态代理设计模式
 * 1.真实角色
 * 2.代理角色：持有真实角色的引用
 * 3.二者实现相同的接口
 * @author Small
 *
 */
public class StaticProxy {
	public static void main(String[] args) {
		//真实角色
		You you = new You();
		//代理角色
		Wedding me = new Wedding(you);
		me.Marry();
	}

}
//接口
interface Marry{
	public abstract void Marry();
}
//真实对象
class You implements Marry{

	public void Marry() {
		// TODO Auto-generated method stub
		
	}
	
}
//代理角色
class Wedding implements Marry{
	private Marry you;
	public Wedding() {
		System.out.println(you+ "me 结婚");
	}
	public Wedding(Marry you) {
		this.you = you;
		System.out.println(you+ "me 结婚");
	}
	public void before() {
		System.out.println("布置婚房");
	}
	public void after() {
		System.out.println("洞房花烛夜");
	}


	public void Marry() {
		// TODO Auto-generated method stub
		before();
		you.Marry();
		after();
		
	}
	
}
