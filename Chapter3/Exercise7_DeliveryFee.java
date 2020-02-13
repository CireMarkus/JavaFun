import java.util.Scanner;

public class Exercise7_DeliveryFee{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int distance = 0;
		int fee = 0;

		System.out.print("Enter the distance of the customer: ");
		distance = sc.nextInt();

		if (distance > 0 && distance < 5){
			fee = 2;
		}
		else if (distance >= 5 && distance < 15){
			fee = 5;
		}
		else if (distance >= 15 && distance < 25){
			fee = 10;
		}
		else if (distance >= 25 && distance < 50){
			fee = 15;
		}
		else{
			fee = 20;
		}

		System.out.println("Delivery Fee: " + fee);
	}
}