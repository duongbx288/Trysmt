package stb_continue_OOP;

import java.util.Scanner;

import Objects.Bicycle;
import Objects.Train;
import Objects.Vehicle;

public class E_4_Dynamic_Polymorphism {

	public static void main(String[] args) {
		// Dynamic polymorphism/Runtime polymorphism
		// 
		// Check 'Vehicle', 'Bicycle', 'Train' class in Objects folder
		
		Scanner scanner = new Scanner(System.in);
		Vehicle vehicle; // The data-type is declared later - to keep memory, etc. 
		
		System.out.println("What vehicle do you want to start?");
		System.out.println("(1=bike) or (2=train): ");
		int choice = scanner.nextInt();
		
		//The code shows how dynamic polymorphism works
		// The data-type is declared during the run-time
		if(choice == 1) {
			vehicle = new Bicycle();
			vehicle.run();
		} else if (choice == 2) {
			vehicle = new Train();
			vehicle.run();
		} else {
			System.out.println("The choice was invalid");
			vehicle = new Vehicle();
			vehicle.run();
		}
	}
}
