package co.yedam.inherit;
/*
 * Bus -> Vehicle, Taxi -> Vehicle
 */

public class DriverExample {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(t); //Vehicle클래스 인스턴스 다형성
		
	}

}
