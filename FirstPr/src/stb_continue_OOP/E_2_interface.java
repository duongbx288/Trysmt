package stb_continue_OOP;

import Objects.Hawk;
import Objects.Rabbit;

public class E_2_interface {
	public static void main(String[] args) {
		// Interface = a template that can be applied to a class
		//			   similar to inheritance, but specifies what a class MUST do
		//		       classes can apply more than one interface. inheritance is limited to 1
		
		//  --> In Objects package
		//	Using: 'Rabbit' <- 'Prey':interface	
		//		   'Hawk' <- 'Prey', 'Predator':interface
		
		
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();
		
		rabbit.flee();
		hawk.hunt();
		hawk.flee();
	}
}
