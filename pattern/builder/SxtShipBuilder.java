package builder;

public class SxtShipBuilder implements AirShipBuilder{
	@Override
	public Engine builderEngine() {
		System.out.println("������");
		return new Engine("��ѧ�÷�����");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("�����");
		return new OrbitalModule("��ѧ�ù����");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("������");
		return new EscapeTower("��ѧ��������");
	}
    
}
