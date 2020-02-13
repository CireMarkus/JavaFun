import java.util.Scanner;

public class Activity5{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the amount of peaches you have: ");

		int numberOfPeaches = sc.nextInt();

		int amountToShip = numberOfPeaches/20;

		int amountRemaining = numberOfPeaches%20;

		//System.out.printf("The amount of peaches you can ship is %d\n",amountToShip);
		//System.out.printf("The amount of peaches reamining is %d\n",amountRemaining);

		System.out.printf("%s %d %s %d %s \n","We have", amountToShip, "full boxes and", amountRemaining, "peaches left.");
	}
}