package Objects;

public class Hero extends Human{
	
	public String power;
	
	//As 'name' and 'age' belongs to the parent class(Human)
	//super = keyword refers to the superclass (parent) of an object
	
	public Hero(String name, int age, double weight,String power){
		//send 'name', 'age', 'weight' value to the parent class
		
		super(name, age, weight);
		this.power = power;
	}
	
	
	//super.toString() refers to the method of the parent class
	@Override
	public String toString() {
		return super.toString()+this.power;
	}
}
