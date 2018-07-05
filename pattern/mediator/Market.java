package mediator;
/**
 * �г���
 * @author Small
 *
 */
public class Market implements Department{
    //�����н��ߵ�����
	private Mediator m;
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("Market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("��ȥ����Ŀ");
		
	}

	@Override
	public void outAction() {
		System.out.println("�г����㱨��������Ŀ�����������Ҫ�ʽ�");
		m.commend("Finacial");
		
	}

}
