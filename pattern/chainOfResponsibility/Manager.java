package chainModel;
/**
 * ����
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
			System.out.println(this.name + "������׼" + request.getEmpName() + "���" + request.getLeaveDays() + "��,���ɣ�" + request.getReason());
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(request);
			}
		}
		
	}

}
