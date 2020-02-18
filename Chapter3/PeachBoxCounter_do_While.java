import java.util.Scanner;

public class PeachBoxCounter_do_While{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		int numberOfPeaches = 0;
		int numOfBoxShipped = 0;
		int numberPicked = 0;
		do{
			


			numberOfPeaches += numberPicked;

			numberPicked = 0;

			while(numberOfPeaches>=20){
				numOfBoxShipped++;
				numberOfPeaches -= 20;
				System.out.printf("%d boxes shipped, %d peaches remaining\n\n",numOfBoxShipped,numberOfPeaches);
				

			}
			System.out.print("Enter the number of peaches that have been picked: ");
			numberPicked = sc.nextInt();
		}while(numberPicked != 0);
	}
}