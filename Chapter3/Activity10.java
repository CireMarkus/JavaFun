import java.util.Scanner;

public class Activity10{
	public static void main(String [] args){

		int totalSeats = 20;

		int purchasedTickets = 0;

		Scanner sc = new Scanner(System.in);

		while(purchasedTickets <totalSeats){
			System.out.printf("There are %d tickets avalible, how many tickets would you like to purchase?: ",(totalSeats - purchasedTickets));
			int customerTickets = sc.nextInt();

			if ((purchasedTickets + customerTickets)<=totalSeats){
				System.out.printf("You have purchased %d tickets.\n\n",customerTickets);
				purchasedTickets+=customerTickets;

			}
			else{
				System.out.printf("Your purchase exceeds the amount of avalible tickets, there are %d tickets left.\n",(totalSeats - purchasedTickets));
			}

		}

		System.out.println("All tickets have been purchased.");

	}
}