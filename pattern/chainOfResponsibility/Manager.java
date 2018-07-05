package chainModel;
/**
 * 经理
 * @author Small
 *
 */
public class Manager extends Leader{

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<10) {
			System.out.println(this.name + "经理，批准" + request.getEmpName() + "请假" + request.getLeaveDays() + "天,理由：" + request.getReason());
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(request);
			}
		}
		
	}

}
