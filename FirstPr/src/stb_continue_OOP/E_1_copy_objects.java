package stb_continue_OOP;

import Objects.Human;

public class E_1_copy_objects {
	
	public static void main(String[] args) {
	
	//Using 'Human' class in 'Objects' package
		
	Human human1 = new Human("Hi", 40, 50);
	//Human human2 = new Human("Hello", 23, 67);
	
	//human1 = human2; ---> have the same address in memory
	// 				   ---> point to the same place in memory
	
	//Copy value of the objects
	//human2.copy(human1);
	
	//Copying using constructor(Overloaded)
	Human human2 = new Human(human1);
	
	System.out.println(human1);
	System.out.println(human2);
	System.out.println();
	System.out.println(human1.getName());
	System.out.println(human2.getName());
	}
}
