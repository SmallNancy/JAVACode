package bridge;
/**
 * 电脑品牌
 * @author Small
 *
 */
public interface Brand {
    void sale();
}
class Lenovo implements Brand{

	@Override
	public void sale() {
        System.out.println("销售联想品牌");		
	}
	
}
class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("销售戴尔品牌");
	}
	
}