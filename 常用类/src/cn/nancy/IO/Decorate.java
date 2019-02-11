package cn.nancy.IO;
/**
 * 装饰器模式 模拟放大器
 * @author Nancy
 *
 */
public class Decorate {
  public static void main(String[] args) {
   Person p = new Person();
   p.say();
   exPerson ex = new exPerson(p);
   ex.say();
	}
}

// 抽象组件
interface Say{
	void say();
}
class Person implements Say{
  private int voice = 10;
  
	public int getVoice() {
		return voice;
	}
	public void setVoice(int voice) {
		this.voice = voice;
	}
	@Override
	public void say() {
		System.out.println("人的声音：" + this.getVoice());
	}
	
}

class exPerson extends Person{
	Person p = new Person();
	public exPerson(Person p) {
		this.p = p;
	}
	@Override
	public void say() {
		System.out.println("人的声音：" + p.getVoice() * 100);
	}
}
