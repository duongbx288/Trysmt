package stb_continue_OOP;

import Objects.Food;

public class D_9_Encapsulation {
	public static void main(String[] args) {
		
		//Encapsulation = attributes of a class will be hidden or private
		//				Can be accessed only through methods (Getters, setters)
		// 				Recommended to make attributes private if you don't have a reason to
		//				to make them public
	
		//Using 'Food' class in Objects package
		
		Food food = new Food("Hamburger");
		
		//System.out.println(food.name); -> Error: 'name' attribute has 'private' modifier
		System.out.println(food.getName());
		food.setName("bread");
		System.out.println(food.getName());
	}
}
