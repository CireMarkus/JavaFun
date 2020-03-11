
public class Doctor implements PersonBehavior,PersonListener {

	@Override
	public void breathe() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		this.onPersonSleeping();
	}

	@Override
	public void walk(int speed) {
		
		this.onPersonWalking();
	}
	
	@Override 
	public void onPersonWalking() {
		System.out.println("Event: onPersonWalking");
	}
	
	@Override
	public void onPersonSleeping() {
		System.out.println("Event: onPersonSleeping");
	}
	
	public static void main(String[] args) {
		Doctor myDoctor = new Doctor();
		myDoctor.walk(20);
		myDoctor.sleep();
	}
	}
