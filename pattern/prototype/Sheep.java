package prototype;

import java.util.Date;
/**
 * �̳�Cloneable�ӿ�
 * ��дclone����
 * @author Small
 *
 */
public class Sheep implements Cloneable{// ��¡�򣬶���
    private String sname;
    private Date birthday;
    
    //��дclone����
	@Override
	protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
    
		return obj;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Sheep() {
		super();
	}

	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
    
}
