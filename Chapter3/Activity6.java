import java.util.Scanner;

public class Activity6{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of hours the employee has worked: ");
		int hours = input.nextInt();

		System.out.print("Enter the employee's pay rate: ");

		float rate = input.nextInt();

		if (hours <= 8){
			System.out.print("The employee worked "+ hours+" hours their pay is: $"+(hours*rate));
		}else if(hours > 8 && hours <= 12){
			float overtime = (rate * .20f)+rate;

			float total = (8*rate)+((hours-8)*overtime);

			System.out.printf("The employee worked %d hours with %d hours of overtime, their pay is: $%.2f ", hours,(hours-8),total);
		}
		else{
			System.out.printf("The employee has worked %d hours with %d of overtime, their pay is: $%.2f\n", hours, (hours-8), (hours*rate)+160);
		}
	}
}