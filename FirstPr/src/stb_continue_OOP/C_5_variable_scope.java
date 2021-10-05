package stb_continue_OOP;

import Objects.diceRoller;

public class C_5_variable_scope {
	
	public static void main(String[] args) {
		
		//Check Objects.diceRoller class for more information
		
		//local = declared inside a method
		//		  visible only to that method
		
		//global = declared outside a method, but within a class
		//		   visible to all parts of a class
		
		diceRoller roller = new diceRoller();
	}
}
