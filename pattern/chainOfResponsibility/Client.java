package chainModel;
/**
 * ������ģʽ
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		Leader a = new Director("������lili");
		Leader b = new Manager("�ž���zz");
		Leader c = new GeneralManager("������");
		
		//�����������ϵ
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		LeaveRequest request = new LeaveRequest("nancy", 15, "go home");
		a.handleRequest(request);
	}
}
