package cn.nancy.cooperation;
/**
 * pattern:生产者消费者模式--管程法
 * 缓冲区作用：解耦，生产者消费者之间只依赖缓冲区；支持并发和异步
 * @author Nancy
 *
 */
public class CoopeDemo {
  public static void main(String[] args) {
  	Container container = new Container();
  	Producter pro = new Producter(container);
  	Customer customer = new Customer(container);
  	new Thread(pro).start();
  	new Thread(customer).start();
	}
}
//生产者
class Producter implements Runnable{
	Container contanier;
	public Producter(Container contanier) {
		this.contanier = contanier;
	}

	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("生产第" + i + "个团子");
			contanier.put(new Dumpling(i));
		}
	}
}

//消费者
class Customer implements Runnable{
	Container contanier;
	public Customer(Container contanier) {
		super();
		this.contanier = contanier;
	}
	public void run() {
		for(int i = 0;i < 100;i++) {
			System.out.println("消费第" + contanier.pop().id + "个团子");
		}
	}
}
//缓冲区
class Container{
	Dumpling dums[] = new Dumpling[10];
	int count = 0;
	
	//放入团子
	public synchronized void put(Dumpling dum) {
		//没有空间，停止生产
		if(count == dums.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dums[count] = dum;
		count++;
		this.notifyAll();
	}
	
	//取出团子
	public synchronized Dumpling pop() {
		if(count == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		count--;
		Dumpling dum = dums[count];
		this.notify();
		return dum;
	}
}


//数据
class Dumpling{
	int id;
	public Dumpling(int id) {
		super();
		this.id = id;
	}
}
