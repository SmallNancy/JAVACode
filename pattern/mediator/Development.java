package mediator;
/**
 * 研发部
 * @author Small
 *
 */
public class Development implements Department{
    //持有中介者的引用
	private Mediator m;
	
	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("专心科研");
		
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作，开发项目");
		
	}

}
