public class Person{
	//Properties
	int age;
	int height;
	String name;

	//Constructor
	public Person(int myAge){
		age = myAge;
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

	private void takeShower(){
		//Do take shower operations here
		System.out.println("Taking a shower...");
	}
}