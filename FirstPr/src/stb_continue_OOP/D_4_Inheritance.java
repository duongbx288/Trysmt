package stb_continue_OOP;

import Objects.Train;
import Objects.Bicycle;

public class D_4_Inheritance {
	
	public static void main(String[] args) {
	// Check in package 'Object'
	//	---> 'Vehicle' class
	//	---> 'Bicycle' class
	//  ---> 'Train'   class
	
	// keyword: extends
	
	Train train = new Train();
	Bicycle bicycle = new Bicycle();
	
	// 'Bicycle' and 'Train' classes inherit attributes and
	//  methods of 'Vehicle' class
	train.go();
	bicycle.stop();
	
	System.out.println(train.getSpeed());
	System.out.println(bicycle.getSpeed());
	
	System.out.println(train.door);
	}
}