package adapter;
/**
 * ������(������������ʽ����Ϸ�ʽ)
 * @author small
 *
 */
public class Adpater2 implements Target {
   private Adpatee adaptee;

@Override
    public void handleReq() {
	    adaptee.request();
    }
    public Adpater2(Adpatee adaptee) {
    	super();
    	this.adaptee = adaptee;
    }
   
}
