package chainModel;
/**
 * ������
 * @author Small
 *
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;
	public Leader(String name) {
		super();
		this.name = name;
	}
	
	//�趨��������̶���
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	/**
	 * ��������ĺ��ĵ�ҵ�񷽷�
	 * @param request
	 */
	public abstract void handleRequest(LeaveRequest request);
    
}
