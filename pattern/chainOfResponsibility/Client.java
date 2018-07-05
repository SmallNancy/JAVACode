package chainModel;
/**
 * 责任链模式
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
		Leader a = new Director("李主任lili");
		Leader b = new Manager("张经理zz");
		Leader c = new GeneralManager("任正非");
		
		//责任链对象关系
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		LeaveRequest request = new LeaveRequest("nancy", 15, "go home");
		a.handleRequest(request);
	}
}
