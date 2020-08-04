
public class Car extends Vehicle{
	
	public void start() {
		System.out.println("THis is start method from the car class");
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		Vehicle v1 = new Vehicle();
		
		c1.start();
		v1.start();
		
		c1.stop();
		v1.stop();

	}

}
