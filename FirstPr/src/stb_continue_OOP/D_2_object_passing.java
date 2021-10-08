package stb_continue_OOP;

import Objects.Food;
import Objects.Garage;

public class D_2_object_passing {
	
	//Check 'Garage' and 'food' for more information
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Food food1 = new Food("BMW");
		Food food2 = new Food("Tesla");
		
		garage.park(food1);
		garage.park(food2);
	}
}
