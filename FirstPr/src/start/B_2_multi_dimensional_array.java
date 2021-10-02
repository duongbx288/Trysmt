package start;

public class B_2_multi_dimensional_array {

	public static void main(String[] args) {
		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Hello";
		cars[0][1] = "Hell";
		cars[0][2] = "Hel";
		cars[1][0] = "H";
		cars[1][1] = "Hdo";
		cars[1][2] = "Hsdfo";
		cars[2][0] = "Hellf";
		cars[2][1] = "Hdsfo";
		cars[2][2] = "He";
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println();
			for(int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j]+"  ");
			}
		}
		
		//U can assign all elements needed at the declaration phase
		//String[][] cars = {{"Camaer","helo","heafs"},{"sdaf"," ", "af"},
		//   				{"ferrari", "lambo", "cardv"}};
	}
}
