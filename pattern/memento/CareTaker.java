package memento;
/**
 * 负责人类
 * 管理备忘录对象
 * @author Small
 *
 */
public class CareTaker {
	private EmpMemento memento;

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
	

}
