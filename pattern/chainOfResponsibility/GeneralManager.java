package chainModel;
/**
 * 总经理
 * @author Small
 *
 */
public class GeneralManager extends Leader{

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<30) {
			System.out.println(this.name + "总经理，批准" + request.getEmpName() + "请假" + request.getLeaveDays() + "天,理由：" + request.getReason());
		}else {
			System.out.println("不批，可以辞职了");
		}
		
	}

}
