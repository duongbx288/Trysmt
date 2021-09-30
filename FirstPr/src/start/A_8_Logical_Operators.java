package start;

import java.util.Scanner;

public class A_8_Logical_Operators {
	
	public static void main(String[] args) {
		
		//Logical Operators
		//		&&	= AND
		//		||	= OR
		//		!	= NOT
		
		int i = 1;
		
		if(i > 10) 
			System.out.println(" i > 10");
		else 
			System.out.println(" i <= 10");
		if(i<10 || i > 20) 
			System.out.println("Condition met.");
		
		//
		
		Scanner scan = new Scanner(System.in);
		System.out.println("You are playing. Press q or Q to quit");
		String resp = scan.next();
		
		if(resp.equals("q") || resp.equals("Q")) {
			System.out.println("You quit the game");
		} else {
			System.out.println("You continue @@");
		}
		
	}
}
