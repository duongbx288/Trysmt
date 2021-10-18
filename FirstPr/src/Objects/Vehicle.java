package Objects;


public /*abstract*/ class Vehicle {
	private double speed;
	
	public void go() {
		System.out.println("This vehicle is moving");
	}
	
	public void stop() {
		System.out.println("This vehicle is stopped");
	}
	
	//FORCES dev to implement/override this method in one of the child classes
	// abstract methods DON'T have the body and the {} sign
	/*abstract*/ public void run() {
		System.out.println("vehicle not available");
	};
	
	public void accelerate() {
		System.out.println("This vehicle is accelerating!!");
	}
	public double getSpeed() {
		return speed;
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
	
	
}
