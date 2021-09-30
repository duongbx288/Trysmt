package start;

public class A_2_Variables {
	public static void main(String[] args) {
		// boolean (pri) : true/false
		// int (pri) : -2billion to 2billion
		// float (pri) : fractional number up to 6-7 digits
		// double (pri) : fractional number up to 15 digits
		// long///
		
		// char (primitive) : single character/letter/ASCII value
		// String (reference) : sequence of characters
		
		//primitive:						reference:
		//- stores data						- stores an address
		//
		//- can only hold 1 value			- can hold more than 1 value
		//
		//- less memory						- more memory
		//
		//- fast							- slower
		
		// Remember: declaration + assignment = innitialization
		
		int a = 123;
		char h = '#';
		String name ="sad";
		System.out.println(a);
		System.out.println(h);
		System.out.println(name);
		
		//
		// Swap - Manual: (If p.language don't have swap function)
		String x = "Hi";
		String y = "Hello";
		String temp;
		
		temp = x;
		x = y;
		y = temp;
	}
}
