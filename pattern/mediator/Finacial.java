package mediator;
/**
 * ����
 * @author Small
 *
 */
public class Finacial implements Department{
    //�����н��ߵ�����
	private Mediator m;
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("Finacial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("��������");
		
	}

	@Override
	public void outAction() {
		System.out.println("���񲿣��㱨�������ʽ𷢷�");
		//m.commend("Finacial");
		
	}

}
