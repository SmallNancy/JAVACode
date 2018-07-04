package facade;

public interface 工商局 {
    void checkName();
}
class 海淀区工商局 implements 工商局{

	@Override
	public void checkName() {
		System.out.println("海淀区工商局检查名字是否冲突");
		
	}
	
}
