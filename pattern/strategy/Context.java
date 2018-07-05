package strategy;
/**
 * 负责具体的策略类交互
 * 具体的算法和直接的客户端分离了，算法可以独立于客户端独立变化
 * 如果使用spring的依赖功能，可以通过配置文件，动态的注入不同的策略对象，动态的切换不同的算法
 * @author Small
 *
 */
public class Context {
    private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
    
	public void printPrice(double s) {
		System.out.println("实际报价：" + strategy.getPrice(s));
	}
}
