package composite;
/**
 * 抽象组件
 * 叶子组件+容器组件
 * @author Small
 *
 */
public interface Component {
    void operation();
}

//叶子组件
interface Leaf extends Component{
	
}
//容器组件
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}
