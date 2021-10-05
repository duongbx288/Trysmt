package Objects;

public class Human {

	String name;
	int age;
	double weight;
	
	//Constructors - allow to construct object
	// 'this' keyword refers to the object using the method
	// 
	public Human(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println(this.name +" is eating");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
