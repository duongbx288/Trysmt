package start;

public class B_8_Method {
	
	// method = a block of code that is executed whenever it is called upon
	
	//For test 1
	static void hello(String name, int age) {
		System.out.println("Hello " + name);
		age += 1;
		System.out.println("Are you "+age+" years old.");
	}
	
	//For test 2
	static int add(int x, int y) {	
		int z = x + y;
		return z;
	}
	
	// add(), hello() are methods
	
	public static void main(String[] args) {
		
		//Test 1
		String name = "Bro";
		int age = 21;
		
		hello(name, age);
		
		System.out.println(age);
		
		//Test 2
		int x = 3;
		int y = 4;	
		int z = add(x,y);
		
		System.out.println("\n"+x+" + "+y+" = "+z);
		System.out.println(add(x,y));
	}
	
}
