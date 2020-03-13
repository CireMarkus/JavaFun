public class Animals{

	public static void main(String[] args){

		Animal animal1 = new Animal();

		Animal animal2 = new Animal(2,2,2);

		animal1.setName("Dog");

		animal2.setName("Homosapien");


		System.out.printf("The first animal is a %s\n\n", animal1.getName());

		System.out.printf("The second animal is a %s\n\n",animal2.getName());

		
	}

}