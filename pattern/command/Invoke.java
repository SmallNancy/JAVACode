package command;

public class Invoke {
	//Ҳ����ͨ������List<Command>������
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	//ҵ�񷽷������������෽��
	public void call() {
		command.execute();
	}

}
