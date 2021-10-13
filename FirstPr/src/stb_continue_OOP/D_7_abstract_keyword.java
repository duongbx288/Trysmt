package stb_continue_OOP;

import Objects.Train;

public class D_7_abstract_keyword {
	
	//Check 'Vehicle' and 'Train' class
	
	public static void main(String[] args) {
	// abstract = abstract classes can't be instantiated
	// 			  but they can have a sub class (child class)
	//			  abstract methods are declared without an implementation
	
	//As 'Vehicle' is an abstract class, it can't be instantiated 
	//Vehicle vehicle = new Vehicle(); -> Error
	Train train = new Train();
	
	train.go();
	train.run();
	}
}
