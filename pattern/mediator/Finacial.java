package mediator;
/**
 * 财务部
 * @author Small
 *
 */
public class Finacial implements Department{
    //持有中介者的引用
	private Mediator m;
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("Finacial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("财务事情");
		
	}

	@Override
	public void outAction() {
		System.out.println("财务部：汇报工作，资金发放");
		//m.commend("Finacial");
		
	}

}
