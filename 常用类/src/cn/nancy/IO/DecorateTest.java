package cn.nancy.IO;
/**
 * װ����ģʽ
 * 1�������������Ҫװ�εĳ�����󣨽ӿڻ�����ࣩ
 * 2����������� ��Ҫװ�εĶ���
 * 3������װ���ࣺ�����˶Գ�������������Լ�װ�ι��еķ���
 * 4������װ���ࣺ��װ�εĶ���
 * @author Nancy
 *
 */
public class DecorateTest {
  public static void main(String[] args) {
  	drink coff = new coffee();
  	milk cm = new milk(coff);
  	suger sm = new suger(coff);
  	System.out.println(cm.cost()+"--" +cm.info());
  	System.out.println(sm.cost()+"--" +sm.info());
	}
}

//�������
interface  drink{
	double cost();
	String info();
}

//�������
class coffee implements drink{
  private String name = "ԭζ����";
	@Override
	public double cost() {
		return 10;
	}

	@Override
	public String info() {
		return name;
	}
	
}
//����װ����
abstract class decor implements drink{
  private drink d;
  public decor (drink d) {
		this.d = d;
	}

	@Override
	public double cost() {
		return this.d.cost();
	}

	@Override
	public String info() {
		return this.d.info();
	}
	
}
//����װ����
class milk extends decor{

	public milk(drink d) {
		super(d);
	}
	@Override
	public double cost() {
		return super.cost()*3;
	}

	@Override
	public String info() {
		return super.info() + "��ţ��";
	}
	
}
 class suger extends decor{

	public suger(drink d) {
		super(d);
	}
	@Override
	public double cost() {
		return super.cost()*2;
	}

	@Override
	public String info() {
		return super.info() + "����";
	} 
 }