package bridge;
/**
 * ����Ʒ��
 * @author Small
 *
 */
public interface Brand {
    void sale();
}
class Lenovo implements Brand{

	@Override
	public void sale() {
        System.out.println("��������Ʒ��");		
	}
	
}
class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("���۴���Ʒ��");
	}
	
}