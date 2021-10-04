package start;

public class B_4_Wrapper_classes {
	public static void main(String[] args) {
		// wrapper class : provide a way to use primitive data types as reference data
		// types
		// reference data types (have access) contain useful methods
		// can be used with collections (ex/ArrayList)

		// primitive ------> //wrapper
		// --------- 		 //-------
		// boolean 			 Boolean
		// char 			 Character
		// int 				 Integer
		// double 			 Double

		// autoboxing = automatic conversion Java compiler makes
		// unboxing = the reserve of autoboxing.

		// Reference Data type start with an upper-case letter
		Boolean a = true; // autoboxing
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Bruh";

		if (a == true) { // unboxing
			System.out.println("This is true");
		}
	}
}
