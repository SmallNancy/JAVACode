package iteratorModel;
/**
 * �ۺ϶��󣺴洢����
 * @author Small
 *
 */

import java.util.ArrayList;
import java.util.List;

public class ConcreteObj {
    private List<Object> list = new ArrayList();

//	public ConcreteObj(List<Object> list) {
//		super();
//		this.list = list;
//	}
	
	public void addObj(Object obj) {
		this.list.add(obj);
	}
	public void removeObj(Object obj) {
		this.list.remove(obj);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
    
	public MyIterator createIterator() {
		return new ConcreIterator();
	}
	
	//ʹ���ڲ��ඨ�������������ֱ��ʹ���ⲿ������
	private class ConcreIterator implements MyIterator{
		
		private int cursor;//�α�,��¼����λ��

		@Override
		public void first() {
            cursor = 0;			
		}

		@Override
		public void next() {
			if(cursor<list.size()) {
				cursor++;
			}
			
		}

		@Override
		public boolean hasnext() {
			if(cursor<list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor == 0?true:false;
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return cursor==(list.size())?true:false;
		}

		@Override
		public Object getCurrentObj() {
			// TODO Auto-generated method stub
			return list.get(cursor);
		}
		
	}
}
