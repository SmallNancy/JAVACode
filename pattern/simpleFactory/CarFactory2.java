package simpleFactory;
/**
 * 250�򵥹�����,Ҳ�о�̬����ģʽ
 * @author Small
 *
 */
public class CarFactory2 {//������
    public static Car createAudi() {
    	return new Audi();
    }
    public static Car createByd() {
    	return new Byd();
    }
}
