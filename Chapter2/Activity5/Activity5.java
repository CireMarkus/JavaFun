import java.util.Scanner;

public class Activity5{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the amount of peaches you have: ");

		float numberOfPeaches = sc.nextFloat();

		float amountToShip = numberOfPeaches/20;

		float amountRemaining = numberOfPeaches%20;

		System.out.printf("The amount of peaches you can ship is %.0f\n",amountToShip);
		System.out.printf("The amount of peaches reamining is %.0f\n",amountRemaining);
	}
}