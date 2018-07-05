package mediator;
/**
 * 市场部
 * @author Small
 *
 */
public class Market implements Department{
    //持有中介者的引用
	private Mediator m;
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("Market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("跑去接项目");
		
	}

	@Override
	public void outAction() {
		System.out.println("市场部汇报工作，项目进度情况，需要资金");
		m.commend("Finacial");
		
	}

}
