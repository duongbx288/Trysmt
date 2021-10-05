package Objects;

public class Car {
	
	String make = "Chervolet";
	String model = "Corvette";
	int year = 2020;
	String color = "blue";
	double price = 50000.00;

	//override toString() method
	public String toString() {
		String mstring = this.make + "\n" +model+"\n"+color+"\n"+year;
		return mstring;
	}
	
	
	public void drive() {
		System.out.println("You drive the car");
	}
	
	void brake() {
		System.out.println("You step on the brake");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	
}
