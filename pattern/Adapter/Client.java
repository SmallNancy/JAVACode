package adapter;

import java.io.InputStream;

/**
 * �ͻ�����(�ʼǱ����ԣ�ֻ��USB�ӿ�)
 * @author small
 *
 */
public class Client {
    public void test1(Target t) {
        t.handleReq();	
    }
    public static void main(String[] args) {
		Client c = new Client();
		Adpatee a = new Adpatee();
		//Target t = new Adpater();
		Target t = new Adpater2(a);
		c.test1(t);
	}
}
