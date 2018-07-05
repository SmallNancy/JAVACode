package strategy;
/**
 * �������Ĳ����ཻ��
 * ������㷨��ֱ�ӵĿͻ��˷����ˣ��㷨���Զ����ڿͻ��˶����仯
 * ���ʹ��spring���������ܣ�����ͨ�������ļ�����̬��ע�벻ͬ�Ĳ��Զ��󣬶�̬���л���ͬ���㷨
 * @author Small
 *
 */
public class Context {
    private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
    
	public void printPrice(double s) {
		System.out.println("ʵ�ʱ��ۣ�" + strategy.getPrice(s));
	}
}
