package start;

public class B_3_String_method {
	
	public static void main(String[] args) {
		//String
		
		String name = "Hello";
		
		//boolean result = name.equalsIgnoreCase("HeLLO");
		//boolean result = name.equals("Hello");
		//int result = name.length();
		//char result = name.charAt(0);
		//int result = name.indexOf("e");
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String result = name.toLowerCase();
		//String result = name.trim(); - delete the space before and after the String
		String result = name.replace('o', 'a');
		
		
		System.out.println(result);
		
		
	}
}
