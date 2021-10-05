package Objects;

public class Pizza {
	
	//Setting these elements' visibility to public is not recommended
	//Should create Getter/Setter instead
	public String bread;
	public String sauce;
	public String cheese;
	public String topping;
	
	//overloaded constructor
	public Pizza(String bread, String sauce) {
		this.bread = bread;
		this.sauce = sauce;
	}
	
	public Pizza(String bread, String sauce, String cheese, String topping) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
}
