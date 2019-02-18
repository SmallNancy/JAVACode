package cn.nancy.syn;
/**
 * ±‹√‚synchronizedÃ◊À¯£¨¥”∂¯±‹√‚À¿À¯
 * @author Nancy
 *
 */
public class LockWrite {
  public static void main(String[] args) {
		Person p1 = new Person(1, "nancy");
		Person p2 = new Person(2, "zmt");
		new Thread(p1).start();
		new Thread(p2).start();
	}
}

class Paper{}
class Pen{}
class Person extends Thread{
	static Paper paper = new Paper();
	static Pen pen = new Pen();
	int choice;
	String name;
	public Person(int choice, String name) {
		super();
		this.choice = choice;
		this.name = name;
	}
	
	@Override
	public void run() {
		if(choice == 1) {
			synchronized(paper) {
				System.out.println(name + "get paper");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				
			}
			synchronized(pen) {
				System.out.println(name + "have a pen,write.");
			}
		}else {
			synchronized(pen) {
				System.out.println(name + "get pen");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		  }
			synchronized(paper) {
				System.out.println(name + "have a paper,write.");
			}
		}
	}
}
