package stb_continue_1;

public class C_2_Final_keyword {
	// anything declared as final can't be changed
	public static void main(String[] args) {
		final double pi = 3.14;
		
		//pi = 4; -> can't be compiled as 'pi' is declared final
		System.out.println(pi);
	}
}
