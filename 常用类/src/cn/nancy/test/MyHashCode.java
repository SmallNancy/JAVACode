package cn.nancy.test;
/**
 * 自定义一个HashMap 
 * @author Small
 *
 */
public class MyHashCode <K,V>{
	MyNode[] table;
	int size;
	public MyHashCode() {
		table = new MyNode[16];
	}
	
	public Object get(Object key) {
		int hash = myHash(key.hashCode(), table.length);
		Object value = null;
		if(table[hash] != null) {
			MyNode temp = table[hash];
			while(temp != null) {
				if(temp.key.equals(key)) {
					value = temp.value;
					break;
				}else {
					temp = temp.next;
				}
			}
		}
		
		return value;
		
	}
	public void put(Object key,Object value) {
		MyNode newNode = new MyNode();
		newNode.hash = myHash(key.hashCode(), table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		MyNode temp = table[newNode.hash];
		boolean keyRe = false;
		if(temp == null) {
			//数组元素为空
			table[newNode.hash] = newNode;
			size++;
		}else {
			// 数组元素不为空时
			MyNode n = new MyNode();
			while(temp != null) {
				if(temp.key.equals(key)) {
					keyRe =true;
					temp.value = value;
					break;
				}else {
					n = temp;
					temp = temp.next;
				}
			}
			if(!keyRe) {
				n.next = newNode;
				size++;
			}
		}
		
	}
	
	public static int myHash(int code,int length) {
		return code&(length - 1);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[") ;
		
		// 遍历数组
		for(int i = 0;i < table.length;i++) {
			MyNode temp = table[i];
			
			// 遍历链表
			while(temp != null) {
				sb.append(temp.key + ":" + temp.value + ",");
				temp = temp.next;
			}
		}
		 sb.setCharAt(sb.length() - 1, ']');
		return sb.toString();
	}
	public static void main(String[] args) {
		MyHashCode<Object, Object> m = new MyHashCode<Object, Object>();
	//	MyHashCode m = new MyHashCode();
		m.put(1, "aa");
		m.put(2, "bb");
		m.put(3, "cc");
		m.put(3, "dd");
		System.out.println(m);
		System.out.println(m.get(1));
	}
}
