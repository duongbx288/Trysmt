package start;

public class B_9_Overloaded_methods {

	// overloading: Ghi chong phuong thuc
	// overload methods = methods share the same name but have different parameters
	//                    method name + parameters = method signature
	
	public static void main(String[] args) {
		
		int x = add(1,2,3);
		double y = add(1.2, 2.3);
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	//static int add(int a, int c){} is invalid
	static int add(int a, int b) {
		return a + b;
	}
	
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static double add(double a, double b) {
		return a + b;
	}
	
	
}
