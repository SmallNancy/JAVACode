package iteratorModel;
/**
 * 正向遍历迭代器模式
 * @author Small
 *
 */
public class Client {
	public static void main(String[] args) {
		ConcreteObj co = new ConcreteObj();
		co.addObj("aa");
		co.addObj("bb");
		co.addObj("cc");
		co.addObj("dd");
		MyIterator it = co.createIterator();
		while (it.hasnext()) {
			System.out.println(it.getCurrentObj());
			it.next();
		}
	}

}
