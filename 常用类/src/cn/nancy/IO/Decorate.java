package cn.nancy.IO;
/**
 * װ����ģʽ ģ��Ŵ���
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

// �������
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
		System.out.println("�˵�������" + this.getVoice());
	}
	
}

class exPerson extends Person{
	Person p = new Person();
	public exPerson(Person p) {
		this.p = p;
	}
	@Override
	public void say() {
		System.out.println("�˵�������" + p.getVoice() * 100);
	}
}
