package Objects;

public class Human {

	private String name;
	private int age;
	private double weight;
	
	//Constructors - allow to construct object
	// 'this' keyword refers to the object using the method
	// 
	public Human(String name, int age, double weight){
		this.setName(name);
		this.setAge(age);;
		this.setWeight(weight);
	}
	
	public Human(Human x){
		this.copy(x);
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
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void copy(Human x) {
		this.name = x.name;
		this.age = x.age;
		this.weight = x.weight;
	}
	
	public String toStringx() {
		return this.name + "\n" + this.age + "\n";
	}
}
