package stb_continue_OOP;

import Objects.Human;

public class C_4_Constructors {
	
	//Check Objects package for more infomation
	public static void main(String[] args) {
		Human human = new Human("Rick", 65, 70.1);
		Human human1 = new Human("Morty",16, 30);
		System.out.println(human.getName());
		human.eat();
		human1.eat();
	}
	
}
