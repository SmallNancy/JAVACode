package mypro04;
/**
 *  test·â×°
 * @author Small
 *
 */
public class TestEncapsulation {
	private int id;
	private String name;
	private int age;
	private boolean flag;
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public boolean isFlag() {
		return flag;
	}
	public static void main(String[] args) {
		TestEncapsulation te = new TestEncapsulation();
		te.setName("nancy");
		System.out.println(te.getName());
	}
}
