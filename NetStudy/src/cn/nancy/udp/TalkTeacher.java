package cn.nancy.udp;

import cn.nancy.netTest.TalkReceive;
import cn.nancy.netTest.TalkSend;

/**
 * ������̣߳�ʵ��˫����
 * ģ��������ѯ
 * @author Nancy
 *
 */
public class TalkTeacher {
  public static void main(String[] args) {
		new Thread(new TalkReceive(9999)).start();  //����
		new Thread(new TalkSend(8877, "localhost", 8888)).start(); //����
	}
}
