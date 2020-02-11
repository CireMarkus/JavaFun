import java.util.Scanner;

public class StockChangeCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the stock symbol:");

		String stockSymbol = sc.nextLine();

		System.out.print("Enter the " + stockSymbol + " day 1 value: ");
		float day1 = sc.nextFloat();

		System.out.print("Enter the " + stockSymbol + " day 2 value: ");
		float day2 = sc.nextFloat();

		System.out.printf("%s's %s %.2f%% %s",stockSymbol, "has changed",(day2-day1),"in one day.");
	}
}