import java.util.Scanner;

public class Exercise5{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		System.out.print("Enter a Number:");
		int num1 = sc.nextInt();

		System.out.println("Entered value is: " + num1);

		float fl1 = num1;

		System.out.println("Entered value as a floating point variable is: " + fl1);
	}
}