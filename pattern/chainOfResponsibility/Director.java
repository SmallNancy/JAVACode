package chainModel;
/**
 * ����
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
			System.out.println(this.name + "���Σ���׼" + request.getEmpName() + "���" + request.getLeaveDays() + "��,���ɣ�" + request.getReason());
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(request);
			}
		}
		
	}

}
