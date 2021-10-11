package stb_continue_OOP;

import Objects.Hero;

public class D_6_super_keyword {
	public static void main(String[] args) {
		
		// super = keyword refers to the superclass (parent) of an object
		//		   similar to "this" keyword
		//
		// ----> Check 'Human' and 'Hero' class in 'Objects' package;
		
		Hero hero1 = new Hero("Batman", 42, 80.4, "$$$");
		Hero hero2 = new Hero("Superman", 43, 99.9, "Everything");
		
		System.out.println(hero1.getName());
		System.out.println(hero1.power);
		
		System.out.println(hero2.toString());
	}
}
