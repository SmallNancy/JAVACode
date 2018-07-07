package memento;
/**
 * 雇员信息
 * 源发器类
 * @author Small
 *
 */
public class Emp {
	private String name;
	private int age;
	private double salary;
	
	//备忘操作,返回备忘对象
	public EmpMemento memento() {
		return new EmpMemento(this);
	}
	
	//数据恢复
	public void recovery(EmpMemento mmt) {
		this.name = mmt.getName();
		this.age = mmt.getAge();
		this.salary = mmt.getSalary();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	

}
