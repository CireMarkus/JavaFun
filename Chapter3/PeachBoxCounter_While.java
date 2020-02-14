import java.util.Scanner;

public class PeachBoxCounter_While{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of peaches you have to ship: ");
		
		int numberOfPeaches = sc.nextInt();
		int numberOfBoxesShipped = 0;
		while(numberOfPeaches >= 20){
			numberOfBoxesShipped++;

			System.out.printf("%d boxes shipped, %d peaches remaing.\n", numberOfBoxesShipped, (numberOfPeaches-=20));

		}

		System.out.printf("There are %d peaches remaining, you need %d more to ship a box.",numberOfPeaches,(20 - numberOfPeaches));
	}
}