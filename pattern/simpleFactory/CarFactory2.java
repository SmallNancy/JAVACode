package simpleFactory;
/**
 * 250简单工厂类,也叫静态工厂模式
 * @author Small
 *
 */
public class CarFactory2 {//创建者
    public static Car createAudi() {
    	return new Audi();
    }
    public static Car createByd() {
    	return new Byd();
    }
}
