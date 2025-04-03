package L;

public class Vehicle_Client {
	public static void main(String[] args) {
		
		Vehicle v = new Car();
		Vehicle v1 = new Cycle();
		v.Speed();
		((Car) v).StartEngine();
	}
}
