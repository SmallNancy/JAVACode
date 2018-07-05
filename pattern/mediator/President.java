package mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator{
    private Map<String, Department> map = new HashMap();
    
	

	@Override
	public void register(String dname, Department d) {
		// TODO Auto-generated method stub
		map.put(dname,d);
	}

	@Override
	public void commend(String dname) {
		map.get(dname).selfAction();;
		
	}

}
