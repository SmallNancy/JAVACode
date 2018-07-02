package prototype;

import java.util.Date;
/**
 * 继承Cloneable接口
 * 重写clone方法
 * @author Small
 *
 */
public class Sheep implements Cloneable{// 克隆羊，多莉
    private String sname;
    private Date birthday;
    
    //重写clone方法
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
