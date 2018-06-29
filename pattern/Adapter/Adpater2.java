package adapter;
/**
 * 适配器(对象适配器方式，组合方式)
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
