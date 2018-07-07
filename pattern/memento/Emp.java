package memento;
/**
 * ��Ա��Ϣ
 * Դ������
 * @author Small
 *
 */
public class Emp {
	private String name;
	private int age;
	private double salary;
	
	//��������,���ر�������
	public EmpMemento memento() {
		return new EmpMemento(this);
	}
	
	//���ݻָ�
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
