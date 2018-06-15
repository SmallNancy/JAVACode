package cn.nancy.threadCreate;

public class proApp {
	public static void main(String[] args) {
//		1）创建真实角色
		Programmer pro = new Programmer();
//		2）创建代理角色+真实角色引用
		Thread proxy = new Thread(pro);
//		3）调用start方法  启动线程
		proxy.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("一边看视频----");
		}
	}

}
