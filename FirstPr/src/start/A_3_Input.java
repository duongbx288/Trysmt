package start;

import java.util.Scanner;

public class A_3_Input {
	// Remember to import java.util.Scanner
	
	public static void main(String[] args) {
		
		//Important
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("What is ur name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine(); //
		System.out.println("What is your favorite hobby?");
		String hobby = scanner.nextLine();
		
		
		// Warning: Use .nextInt() before .nextLine()
		// will have some problem: 
		// as .nextInt() doesn't read the '\n' character in the scanner.
		// So the '\n' is still stored in the scanner and 
		// when the .nextLine() function is called, it will
		// read the '\n' first and then stop.
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + "years old.");
		System.out.println("My favorite hobby is "+hobby);
		
		// So for String type variables, we can
		// use .next() instead of .nextLine()
		System.out.println("Why are you here?");
		String reason = scanner.nextLine();
		System.out.println(reason);
		

	}
}
