package cn.nancy.IO;
/**
 * װ����ģʽ ģ��Ŵ���
 * @author Nancy
 *
 */
public class Decorate {
  public static void main(String[] args) {
    Person p = new Person();
    p.voice();
    newPer np = new newPer(p);
    np.voice();
	}
}

interface say{
	void voice();
}

class Person implements say{
	private int degree = 10;
	@Override
	public void voice() {
		System.out.println(this.getDegree());
	}
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	
}
class newPer implements say{
  Person p = new Person();
  newPer( Person p) {
  	this.p = p;
	}
	@Override
	public void voice() {
		System.out.println(p.getDegree()*100);
	}
	
}