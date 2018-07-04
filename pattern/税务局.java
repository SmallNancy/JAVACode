package facade;

public interface 税务局 {
    void taxOpen();
}
class 海淀税务局 implements 税务局{
	@Override
	public void taxOpen() {
		System.out.println("海淀税务局办理证件");
	}
}
