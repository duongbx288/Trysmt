package stb_continue_OOP;

import Objects.Food;

public class D_1_array_of_objects {
	
	public static void main(String[] args) {
		
		Food[] fridge = new Food[3];

		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hotdog");
		//Food[] refrigerator = {food1, food2, food3};
		
		fridge[0] = food1;
		fridge[1] = food2;
		fridge[2] = food3;
		
		System.out.println(fridge[0]); // Show the address of 'food1' object in memory
		System.out.println(fridge[0].getName());
	}
}
