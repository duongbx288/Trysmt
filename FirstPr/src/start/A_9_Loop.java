package start;

import java.util.Scanner;

public class A_9_Loop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		
		//while loop (do...while is similar - except do...while will run.. first)
		while(name.isBlank()) {
			System.out.println("Enter your name:");
			name = scan.nextLine();
		}
		
		System.out.println("Hello "+name);
				//do____while()
		
		//for loop
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("Waiting for more numbers.");
	
		//nested loop 
		int rows;
		int columns;
		
		System.out.println("Enter # of rows");
		rows = scan.nextInt();
		System.out.println("Enter # of columns");
		columns = scan.nextInt();
		
		for(int i = 1; i <= rows; i++) {
			System.out.println();
			for(int j = 1; j <= columns; i++) {
				System.out.print("%");
			}
		}
	}

}
