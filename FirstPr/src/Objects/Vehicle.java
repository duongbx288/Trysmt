package Objects;

public class Vehicle {
	private double speed;
	
	public void go() {
		System.out.println("This vehicle is moving");
	}
	
	public void stop() {
		System.out.println("This vehicle is stopped");
	}
	
	public void accelerate() {
		System.out.println("This vehicle is accelerating!!");
	}
	public double getSpeed() {
		return speed;
	}
}
