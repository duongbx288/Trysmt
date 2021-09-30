package start;

import java.util.Scanner;

public class A_5_Math {
	
	//Function of the Math class
	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		double z = Math.min(x, y);
		
		double a = Math.max(x, y);
		double b = Math.abs(a);
		//double c = Math.sqrt(x);
		//double d = Math.ceil(x); // Round-up
		//double e = Math.floor(x); // Round-down
		
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);
		//System.out.println(e);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		System.out.println(z);
	}
}
