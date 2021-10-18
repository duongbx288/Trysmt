package stb_continue_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E_5_exception_handling {

	public static void main(String[] args) {
		// exception = an event that occurs during the execution of a
		// program that disrups the normal flow of
		// instructions

		// If encounters ArithmeticException, the code in the try{} block
		// will be stopped, then the code in the catch{} block will
		// be executed
		// finaly{} block code will always be executed
		// whether or not we catch an exception

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter a whole number to divide: ");
			int x = scan.nextInt();

			System.out.println("Enter a number to divide by:");
			int y = scan.nextInt();

			int z = x / y;
			System.out.println("result: " + z);
		} catch (ArithmeticException e) {
			System.out.println("You can't divide by zero!");
		} catch (InputMismatchException e) {
			System.out.println("Enter a number please....");
		} catch (Exception e) {
			System.out.println("Something went wrong...");
		} finally {
			System.out.println("This is always executed");
			scan.close();
		}
	}
}
