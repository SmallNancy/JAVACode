package iteratorModel;
/**
 * �Զ���������ӿ�
 * @author Small
 *
 */
public interface MyIterator {
    void first();//���α�ָ���һ��Ԫ��
    void next();//�α�ָ����һ��Ԫ��
    boolean hasnext();//�ж��Ƿ������һ��Ԫ��
    
    boolean isFirst();
    boolean isLast();
    
    Object getCurrentObj();//��ȡ��ǰ�α�ָ��Ķ���
}
