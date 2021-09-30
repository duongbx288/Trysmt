package start;

public class A_7_Switch {

	//Switch
	public static void main(String[] args) {
		
		String day = "Sunday";
		
		//Notice the difference in the result
		switch(day) {
			case "Sunday":System.out.println("It is Sunday");
			case "Monday":System.out.println("It is 2");
			break;
			case "Tuesday":System.out.println("It is 3");
			break;
			case "Wednesday":System.out.println("It is 4");
			break;
			case "Thursday":System.out.println("It is 5");
			break;
			case "Friday":System.out.println("It is 6");
			break;
			case "Satursday":System.out.println("It is 7");
			break;
			default: System.out.println("Not a day");
		}
	}
}
