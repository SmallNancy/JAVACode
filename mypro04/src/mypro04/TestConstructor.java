package mypro04;
/**
 *      ���������޲Ρ��в�
 * @author Small
 *
 */
class Point{
	double x,y;
	static String str = "hello";
	
	//1����̬��ʼ���飬ֻ�ܵ��þ�̬�ķ����;�̬����
	static {
		System.out.println(str);
		print();
	}
	public static void print() {
		System.out.println("���");
	}
	public Point() {
		
	}
	public Point(double x) {
		this.x = x;
	}
	public Point(double x,double y) {
		this(x);      //this���ù�����
//		this.x = x;   //this ��ʾ�����õĶ��󣬲���this��ʾ�ֲ�����
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
