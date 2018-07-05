package chainModel;
/**
 * 主任
 * @author Small
 *
 */
public class Director extends Leader{

	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<3) {
			System.out.println(this.name + "主任，批准" + request.getEmpName() + "请假" + request.getLeaveDays() + "天,理由：" + request.getReason());
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(request);
			}
		}
		
	}

}
