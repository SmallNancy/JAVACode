package memento;
/**
 * ����¼ģʽ
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		Emp emp = new Emp("nancy",16, 6000);
		System.out.println("��һ��" + emp.getName() + "age:" + emp.getAge() + "salary:" + emp.getSalary());
		taker.setMemento(emp.memento());//����һ��;
		emp.setAge(12);
		System.out.println("�ڶ���" + emp.getName() + "age:" + emp.getAge() + "salary:" + emp.getSalary());
		emp.recovery(taker.getMemento());
		System.out.println("������" + emp.getName() + "age:" + emp.getAge() + "salary:" + emp.getSalary());
	}
}
