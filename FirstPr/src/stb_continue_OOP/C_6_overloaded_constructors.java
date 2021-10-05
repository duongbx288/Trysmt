package stb_continue_OOP;

import Objects.Pizza;

public class C_6_overloaded_constructors {

	public static void main(String[] args) {
		
		//  overloaded constructors:
		//	multiple constructors within a class with the same name,
		//  but have different parameters
		//  name + parameters = signature
		
		Pizza pizza = new Pizza("thick-crust","tomatoes","mozzerella","pepperoni");
		
		System.out.println("Here are some ingredients of ur pizza");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		//Using overloaded constructor
		Pizza pizz = new Pizza("bread", "wine");
		
		System.out.println("Here are some ingredients of ur pizza");
		System.out.println(pizz.bread);
		System.out.println(pizz.sauce);
	}
	
}
