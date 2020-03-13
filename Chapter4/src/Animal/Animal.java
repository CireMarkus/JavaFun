package src;
public class Animal{
	//Fields
	int legs;
	int ears;
	int eyes;
	String family;
	String name;

	//Constructors
	public Animal(){
		this.legs = 4;
		this.ears = 2;
		this.eyes = 2;
	}

	public Animal(int legs, int ears, int eyes){
		this.legs = legs;
		this. ears = ears;
		this.eyes = eyes;
	}

	//Setters
	public void setName(String name){
		this.name = name;
	}

	public void setFamily(String family){
		this.family = family;
	}

	//Getters
	public String getName(){
		return this.name;
	}

	public String getFamily(){
		return this.family;
	}

}