package cn.nancy.udp;

import cn.nancy.netTest.TalkReceive;
import cn.nancy.netTest.TalkSend;

/**
 * 加入多线程，实现双向交流
 * 模拟在线咨询
 * @author Nancy
 *
 */
public class TalkTeacher {
  public static void main(String[] args) {
		new Thread(new TalkReceive(9999)).start();  //接收
		new Thread(new TalkSend(8877, "localhost", 8888)).start(); //发送
	}
}
