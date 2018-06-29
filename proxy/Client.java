package proxy;

public class Client {
	public static void main(String[] args) {
		Star real = new RealStar();
	    Star proxy = new ProxyStar(real);
	    proxy.conger();
	    proxy.signContract();
	    proxy.bookTicket();
	    proxy.sing();
	    proxy.collectMoney();
	}
    
}
