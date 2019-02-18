package cn.nancy.syn;

import java.util.Date;
/**
 * 死锁以及解决
 * @author Nancy
 *
 */
public class DeadLock {
	public static void main(String[] args) {
		Com c = new Com(3,3);
		Pro pro1 = new Pro(3, 2, c,"a",1000,60);
		Pro pro2 = new Pro(2, 3, c,"b",1000,35);
		Pro pro3 = new Pro(3, 2, c,"c",1000,42);
		Pro pro4 = new Pro(2, 2, c,"d",1000,76);
		Pro pro5 = new Pro(3, 2, c,"e",1000,112);
		Date starttime = new Date(System.currentTimeMillis());
		new Thread(pro1).start();
		new Thread(pro2).start();
		new Thread(pro3).start();
		new Thread(pro4).start();
		new Thread(pro5).start();
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(pro1.flag==true&&pro2.flag==true&&pro3.flag==true&&pro4.flag==true&&pro5.flag==true) {
				Date endtime = new Date(System.currentTimeMillis());
				System.out.println(endtime.getTime()-starttime.getTime());
				break;
			}			
		}
	}
}
class Pro implements Runnable{
	boolean flag = false;
	Com com;
	int NeedCpu;
	int NeedIo;
	int HadCpu;
	int HadIo;
	String name;
	int maxSleepTime;
	final int defaultSleepTime = 1000;
	final int defaultDelayTime = 100;
	int delayTime = defaultDelayTime;
	public Pro(int NeedCpu,int NeedIo,Com com,String name) {
		this.NeedCpu = NeedCpu;
		this.NeedIo = NeedIo;
		this.com = com;
		this.name = name;
		this.maxSleepTime = defaultSleepTime;
	}
	public Pro(int NeedCpu,int NeedIo,Com com,String name,int maxSleepTime,int delayTime) {
		this.NeedCpu = NeedCpu;
		this.NeedIo = NeedIo;
		this.com = com;
		this.name = name;
		this.maxSleepTime = maxSleepTime;
		this.delayTime = delayTime;
	}
	public void run(){
		int sleepTime = 0;
		while(true) {
			try {
				Thread.sleep(delayTime);
				sleepTime += delayTime;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(HadCpu >= NeedCpu && HadIo >= NeedIo) {
				System.out.println("程序"+name+"已运行完毕");
				com.haveRes(HadCpu, HadIo);
				flag = true;
				break;
			}else {
				System.out.println("程序" + name + "已经有" + HadCpu + "个CPU和" + HadIo + "个IO");
				if(NeedCpu - HadCpu > com.cpu || NeedIo - HadIo > com.io) {
					com.haveRes(HadCpu, HadIo);
					HadCpu = 0;
					HadIo = 0;
					sleepTime = 0;
					continue;
				}
				if(HadCpu<NeedCpu) {
					if(1 == com.getCpu()) {
						HadCpu++;
					}                                                   
				}
				if(HadIo < NeedIo) {
					if(1 == com.getIo()) {
						HadIo++;
					}
				}
				
			}
			
			if(sleepTime >= maxSleepTime) {
				com.haveRes(HadCpu, HadIo);
				HadCpu = 0;
				HadIo = 0;
				sleepTime = 0;
			}
			
		}
	}
	
}


class Com{
	int cpu;
	int io;
	public Com(int cpu,int io) {
		this.cpu = cpu;
		this.io = io;
	}
	public int getCpu() {
		if(cpu>0) {
			cpu--;	
			return 1;
		}else {
			return -1;
		}
	}
	public int getIo() {
		if(io>0) {
			io--;	
			return 1;
		}else {
			return -1;
		}
	}
	public void haveRes(int cpu,int io) {
		this.cpu += cpu;
		this.io += io;
	}
}
