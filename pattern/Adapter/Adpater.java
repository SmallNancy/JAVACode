package adapter;
/**
 * ������(����������ʽ�̳�)
 * @author small
 *
 */
public class Adpater extends Adpatee implements Target {
	@Override
    public void handleReq() {
    	super.request();
    }
}
