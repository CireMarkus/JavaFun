import java.util.Scanner;

public class Activity2{
	public static void main(String [] args){
		System.out.print("Enter a number:" );

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		System.out.println("Enter the second number");
		int b = sc.nextInt();

		int sum = a + b;

		System.out.println("The sum of your numbers is: " + sum);
	}
}