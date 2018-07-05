package command;

public class Invoke {
	//也可以通过容器List<Command>批处理
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	//业务方法，用于命令类方法
	public void call() {
		command.execute();
	}

}
