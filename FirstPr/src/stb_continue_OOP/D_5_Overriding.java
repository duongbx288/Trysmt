package stb_continue_OOP;

import Objects.Train;
import Objects.Vehicle;

public class D_5_Overriding {
	
	public static void main(String[] args) {
		// method overriding = Declaring a method in sub class
		//					   which is already present in parent class
		//	-> Is done so that a child class can give its own implementation				   
		
		// -> Check 'Vehicle' and 'Train' class in 'Objects' package
		// 'Train' class inherits 'Vehicle' class
		Train train = new Train();
		Vehicle bike = new Vehicle();
		
		bike.accelerate();
		train.accelerate();
	
	}
}
