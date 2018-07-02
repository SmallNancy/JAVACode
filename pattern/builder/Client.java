package builder;
/**
 * 建造者模式
 * @author Small
 *
 */
public class Client {
    public static void main(String[] args) {
	    AirShipDirector director = new SxtShipDirector(new SxtShipBuilder());
	    AirShip ship = director.directAirShip();
	    System.out.println(ship.getEngine());
    }
}
