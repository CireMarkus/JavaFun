import java.util.Scanner;

public class PeachBoxCounter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of peaches you have: ");
		int peaches = sc.nextInt();

		for(int i = 0; i <= peaches; i+=20){

			System.out.println("shipped " + i + " peaches so far.");
		}

		System.out.println("All boxes shipped");
	}
}