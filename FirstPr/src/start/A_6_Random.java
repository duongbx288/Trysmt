package start;

import java.util.Random;

public class A_6_Random {
	
	//Random class
	//If statement
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt();
		System.out.println(x); // X is randomized between -2bil and 2bil
		
		x = random.nextInt(6); // 0 - 6
		System.out.println(x);
		
		boolean z = random.nextBoolean();
		System.out.println(z);
		
		if(z == true) {
			System.out.println(x);
		} else System.out.println(z);
	    
	}
}
