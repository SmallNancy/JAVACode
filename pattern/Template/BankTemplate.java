package templateMethod;

public abstract class BankTemplate {
	//���巽��
    public void takeNumber() {
		System.out.println("ȡ���Ŷ�");
	}
    //�������ҵ�񣬹��ӷ���
    public abstract void transact();
    public void evaluate() {
    	System.out.println("��������");
    }
    
    //ģ�巽��һ�㲻����д
    public final void process() {
		this.takeNumber();
		this.transact();//�������
		this.evaluate();
	}
}
