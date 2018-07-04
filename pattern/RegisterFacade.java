package facade;
/**
 * 办理注册公司流程
 * @author Small
 *
 */
public class RegisterFacade {
    public void register() {
    	工商局 g = new 海淀区工商局();
    	g.checkName();
    	税务局 s = new 海淀税务局();
    	s.taxOpen();
    	银行 y = new 工商银行();
    	y.openAccount();
    	质监局 z = new 海淀质监局();
    	z.CodeCertificate();
    }
}
