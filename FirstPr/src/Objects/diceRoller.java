package Objects;

import java.util.Random;

public class diceRoller {
	int number; //global variable
	
	public diceRoller(){
		Random random = new Random(); //local object
		roll(random);
	}
	
	public void roll(Random random) {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
