package cn.nancy.netTest;
/**
 * ������ѯ 
 * @author Nancy
 *
 */
public class TalkStudent {
  public static void main(String[] args) {
		new Thread(new TalkSend(6666, "localhost", 9999)).start(); //����
		new Thread(new TalkReceive(8888)).start();
	}
}
