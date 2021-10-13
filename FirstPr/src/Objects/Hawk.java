package Objects;

public class Hawk implements Predator, Prey{

	//As 'Hawk' class uses 'Predator' interface 
	//It must override the 'hunt()' method of the 'Predator'
	@Override
	public void hunt() {
		System.out.println("The hawk is hunting");
	}
	
	@Override 
	public void flee() {
		System.out.println("The hawk is fleeing from the hunter!");
	}
}
