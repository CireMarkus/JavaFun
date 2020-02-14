import java.util.Scanner;

public class Activity7{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		String weatherWarning;
		System.out.print("Enter the temp for today (High, Low, Humid): ");
		String temp = sc.nextLine();

		switch(temp){
			case "High":
				weatherWarning = "It's a hot one today, you should wear some suncreen.";
				break;

			case "Low":
				weatherWarning = "It's a bit chilly today, you should take a jacket.";
				break;
			case "Humid":
				weatherWarning = "It's humid today, remember to stay hydrated.";
				break;
			default:
				weatherWarning = "Looks good today, have a nice day.";
		}

		System.out.println(weatherWarning);

	}
}