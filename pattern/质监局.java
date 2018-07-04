package facade;

public interface 质监局 {
    void CodeCertificate();
}
class 海淀质监局 implements 质监局{
	@Override
	public void CodeCertificate() {
		System.out.println("海淀区办理组织代码证");
	}
}
