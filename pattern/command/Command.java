package command;

public interface Command {
	/**
	 * ʵ����Ŀ������ƶ����ͬ����
	 */
    void execute();
}

class ConcreteCommand implements Command{
    private Receiver receiver;//��������ִ����
    
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		System.out.println("execute ִ��");
		
	}
	
}
