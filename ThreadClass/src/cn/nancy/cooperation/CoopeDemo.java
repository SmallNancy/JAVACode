package cn.nancy.cooperation;
/**
 * pattern:������������ģʽ--�̷ܳ�
 * ���������ã����������������֮��ֻ������������֧�ֲ������첽
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
//������
class Producter implements Runnable{
	Container contanier;
	public Producter(Container contanier) {
		this.contanier = contanier;
	}

	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("������" + i + "������");
			contanier.put(new Dumpling(i));
		}
	}
}

//������
class Customer implements Runnable{
	Container contanier;
	public Customer(Container contanier) {
		super();
		this.contanier = contanier;
	}
	public void run() {
		for(int i = 0;i < 100;i++) {
			System.out.println("���ѵ�" + contanier.pop().id + "������");
		}
	}
}
//������
class Container{
	Dumpling dums[] = new Dumpling[10];
	int count = 0;
	
	//��������
	public synchronized void put(Dumpling dum) {
		//û�пռ䣬ֹͣ����
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
	
	//ȡ������
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


//����
class Dumpling{
	int id;
	public Dumpling(int id) {
		super();
		this.id = id;
	}
}
