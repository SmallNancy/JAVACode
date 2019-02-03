package cn.nancy.IO;
/**
 * 装饰器模式
 * 1、抽象组件：需要装饰的抽象对象（接口或抽象父类）
 * 2、具体组件： 需要装饰的对象
 * 3、抽象装饰类：包含了对抽象组件的引用以及装饰共有的方法
 * 4、具体装饰类：被装饰的对象
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

//抽象组件
interface  drink{
	double cost();
	String info();
}

//具体组件
class coffee implements drink{
  private String name = "原味咖啡";
	@Override
	public double cost() {
		return 10;
	}

	@Override
	public String info() {
		return name;
	}
	
}
//抽象装饰类
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
//具体装饰类
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
		return super.info() + "加牛奶";
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
		return super.info() + "加糖";
	} 
 }