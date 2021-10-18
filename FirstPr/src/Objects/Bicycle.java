package Objects;

public class Bicycle extends Vehicle{
	
	public int wheels = 2;
	public int doors = 0;
	
	@Override
	public void run() {
		System.out.println("The bike starts to run");
	}
	
	@Override
	public void start() {
		System.out.println("Bike starts going");
	}
}
