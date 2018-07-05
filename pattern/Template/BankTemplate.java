package templateMethod;

public abstract class BankTemplate {
	//具体方法
    public void takeNumber() {
		System.out.println("取号排队");
	}
    //办理具体业务，钩子方法
    public abstract void transact();
    public void evaluate() {
    	System.out.println("反馈评分");
    }
    
    //模板方法一般不能重写
    public final void process() {
		this.takeNumber();
		this.transact();//像个钩子
		this.evaluate();
	}
}
