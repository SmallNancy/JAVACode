package abstractFactory;

public class LowCarFacroty implements CarFactory{

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		// TODO Auto-generated method stub
		return new LowSeat();
	}

	@Override
	public Tyre createTyre() {
		// TODO Auto-generated method stub
		return new LowTyre();
	}

}
