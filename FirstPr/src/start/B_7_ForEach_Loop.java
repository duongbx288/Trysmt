package start;

import java.util.ArrayList;

public class B_7_ForEach_Loop {

	public static void main(String[] args) {

		// for-each loop = Traversing technique to iterate through the elements in an
		// 					array/collection
		// 					Less steps, more readable
		//					Less flexible

		//String[] animals = { "cat", "dog", "rat", "bird" };
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("dog");
		animals.add("dog");
		animals.add("bird");
		
		for (String i : animals) {
			System.out.println(i);
		}
		
		
	}
}
