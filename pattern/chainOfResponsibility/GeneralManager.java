package chainModel;
/**
 * �ܾ���
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
			System.out.println(this.name + "�ܾ�����׼" + request.getEmpName() + "���" + request.getLeaveDays() + "��,���ɣ�" + request.getReason());
		}else {
			System.out.println("���������Դ�ְ��");
		}
		
	}

}
