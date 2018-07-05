package command;

public interface Command {
	/**
	 * 实际项目可以设计多个不同方法
	 */
    void execute();
}

class ConcreteCommand implements Command{
    private Receiver receiver;//命令真正执行者
    
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		System.out.println("execute 执行");
		
	}
	
}
