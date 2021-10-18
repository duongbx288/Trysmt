package Objects;

//Train class inherits 'Vehicle' class
public class Train extends Vehicle{
	
	public int wheels = 50;
	public int door = 10;
	
	//Override accelerate() method of 'Vehicle' class
	@Override
	public void accelerate() {	
		System.out.println("The limit is broken. The train goes to 'Hyper-acceleration' mode");
	}
	
	@Override
	public void run() {
		System.out.println("The train's engine starts to run");
	}
	
	@Override
	public void start() {
		System.out.println("Begin to move");
	}
}
