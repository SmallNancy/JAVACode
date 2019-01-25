package mypro04;
/**
 *      构造器：无参、有参
 * @author Small
 *
 */
class Point{
	double x,y;
	static String str = "hello";
	
	//1、静态初始化块，只能调用静态的方法和静态变量
	static {
		System.out.println(str);
		print();
	}
	public static void print() {
		System.out.println("你好");
	}
	public Point() {
		
	}
	public Point(double x) {
		this.x = x;
	}
	public Point(double x,double y) {
		this(x);      //this调用构造器
//		this.x = x;   //this 表示创建好的对象，不加this表示局部变量
		this.y = y;
	}
	public double getDistance(Point p) {
		return Math.sqrt((x-p.x) * (x-p.x) + (y-p.y)*(y-p.y));
	}
}
public class TestConstructor {
  public static void main(String[] args) {
	Point p = new Point(3.0,4.0);
	Point p2 = new Point(4,5.0);
	System.out.println(p.getDistance(p2));
  }
}
