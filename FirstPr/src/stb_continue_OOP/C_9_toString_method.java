package stb_continue_OOP;

import Objects.Car;

public class C_9_toString_method {
	
	public static void main(String[] args) {
		
		// toString():
		// special method that all objects inherit
		// -> returns a string that "represents" an object
		// Can be used both implicitly and explicitly
	
		Car car = new Car();
		
		//explicit use
		System.out.println(car.toString());
		//implicitly
		System.out.println(car);
	}
}
