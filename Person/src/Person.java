public class Person{
	//Properties
	int age;
	int height;
	int weight;
	String name;

	//Constructor
	public Person(int myAge, int myHeight, int myWeight){
		this.age = myAge;
		this.height = myHeight;
		this.weight = myWeight;
	}

	public Person(){
		this(28, 10, 60);
	}


	//Methods
	public void walk(int speed){
		//Do walking operations here
		if (speed > 10){
			System.out.println("Walking...");	
		}
		

	}

	public void sleep(){
		//Do sleeping operations here
		System.out.println("Sleeping...");
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public int getHeight(){
		return height;
	}

	public int getWeight(){
		return weight;
	}

	public String getName(){
		return this.name;
	}
	@SuppressWarnings("unused")
	private void takeShower(){
		//Do take shower operations here
		System.out.println("Taking a shower...");
	}
}