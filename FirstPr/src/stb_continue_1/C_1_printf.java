package stb_continue_1;

public class C_1_printf {
	
	// printf() = an optional method to control aand display text to 
	//			  the console window
	//			  include 2 arguments = format string + (object/variable/value)
	//			  % [flag] [width] [.precision] [conversion-character]
	
	public static void main(String[] args) {
	
		boolean Bool = true;
		char Char = '@';
		String myString = "Bruh";
		int myInt = 50;
		double Double = 1000000; // float is similar
		
		//System.out.printf("%d This is a format string \n", myInt);
		//System.out.printf("%c\n", Char);
		//System.out.printf("%s\n", myString);
		//System.out.printf("%b\n", Bool);
		//System.out.printf("%f\n", Double);
		
		// [width] : minimum number of characters to be written as output
		System.out.printf("Hello %10s\n", myString);
		
		
		// [precision] : set the number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.2f\n", Double);
		
		
		// [flags] : adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus or minus sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : coma grouping seperator if numbers > 1000
		
		System.out.printf("You have this much money %+,015.2f", Double);
	}
}
