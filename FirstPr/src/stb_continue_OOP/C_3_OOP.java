package stb_continue_OOP;

import Objects.Car;

public class C_3_OOP {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car myCar2 = new Car();
		
		System.out.println(myCar.getModel());
		System.out.println(myCar2.getModel());
		
		myCar.drive();
	}
}
