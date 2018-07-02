package builder;

public class SxtShipBuilder implements AirShipBuilder{
	@Override
	public Engine builderEngine() {
		System.out.println("发动机");
		return new Engine("上学堂发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("轨道舱");
		return new OrbitalModule("上学堂轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("逃逸塔");
		return new EscapeTower("上学堂逃逸塔");
	}
    
}
