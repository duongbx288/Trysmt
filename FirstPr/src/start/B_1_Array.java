package start;

public class B_1_Array {
	public static void main (String[] args) {
		
		String[] cars = {"Camaro", "Corvetter", "Tesla"};
		cars[0] = "Mustang";
		
		//System.out.println(cars[3]); -> Error as 
		//the 3rd element of the array doesnt exist
		
		System.out.println(cars[2]);
		
		// We can also use:
		// String[] cars = new String[3];
		// Then assign the value for elements of the array
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
} 
