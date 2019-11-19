package chapter02;

public class ParkingSystemTest {

	public static void main(String[] args) {
		ParkingSystem ps = new ParkingSystem();
		
		ps.park(new Bus());
		ps.park(new SportsCar());
		ps.park(new Truck());
		ps.park(new Poclain());
		ps.park(new ToyCar());
		ps.park(new Airplane());
	}

}
