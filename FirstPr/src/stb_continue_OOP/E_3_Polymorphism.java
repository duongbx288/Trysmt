package stb_continue_OOP;

import Objects.Bicycle;
import Objects.Train;
import Objects.Vehicle;

public class E_3_Polymorphism {
	
	public static void main(String[] args) {
	//polymorphism = the ability of an object to identify
	//               as more than one type
		
	//Check 'Objects' package, 'Bicycle', 'Train', 'Vehicle' class.	
		Bicycle bicycle = new Bicycle();
		Train train = new Train(); 
		
		Vehicle[] transportation = {bicycle, train}; 
		
		bicycle.start();
		train.start();
		
		for(Vehicle x : transportation) {
			x.start();
		}
	}
}