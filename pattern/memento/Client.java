package memento;
/**
 * 备忘录模式
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		Emp emp = new Emp("nancy",16, 6000);
		System.out.println("第一次" + emp.getName() + "age:" + emp.getAge() + "salary:" + emp.getSalary());
		taker.setMemento(emp.memento());//备忘一次;
		emp.setAge(12);
		System.out.println("第二次" + emp.getName() + "age:" + emp.getAge() + "salary:" + emp.getSalary());
		emp.recovery(taker.getMemento());
		System.out.println("第三次" + emp.getName() + "age:" + emp.getAge() + "salary:" + emp.getSalary());
	}
}
