package src;

public class Cow implements AnimalBehavior, AnimalListener {
	
	//fields 
	String sound;
	String movementType;
	
	
	@Override
	public void onAnimalMoved() {
		System.out.println("Animal moved: "+ movementType);

	}

	@Override
	public void onAnimalSound() {
		System.out.println("Sound made: "+ sound);

	}

	@Override
	public void move() {
		this.movementType = "Walking";
		this.onAnimalMoved();

	}

	@Override
	public void makeSound() {
		this.sound = "Moo";
		this.onAnimalSound();

	}

	public static void main(String[] args) {
	Cow cow1 = new Cow();
	cow1.move();
	cow1.makeSound();
	
	}
}

