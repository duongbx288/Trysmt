package start;

import java.util.ArrayList;

public class B_5_ArrayList {
	public static void main(String[] args) {
		
		// ArrayList = a resizable array
		//           Only store reference data types
		// 
		// -> So to store primitive data types,
		// 	  The wrapper classes have to be used
		//    Ex: ArrayList<Integer> integ = new ArrayList<Integer>
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi");    //"pizza" changed to "sushi"
		food.remove(2);          // Remove "hotdog"
		food.clear();			 // Remove all elements 	
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		
	}
}
