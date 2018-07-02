package prototype;

import java.util.Date;
/**
 * deep clone
 * �̳�Cloneable�ӿ�
 * ��дclone����
 * @author Small
 *
 */
public class Sheep2 implements Cloneable{// ��¡�򣬶���
    private String sname;
    private Date birthday;
    
    //��дclone����
	@Override
	protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        
        //������´���ʵ�����
        Sheep2 s = (Sheep2) obj;
        s.birthday = (Date) this.birthday.clone();
        
        
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

	public Sheep2() {
		super();
	}

	public Sheep2(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
    
}
