import java.util.Scanner;

public class Activity4{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//User inputs their name. 
		System.out.print("Enter your first and last name: ");
		String studentName = sc.nextLine();

		//User input university 
		System.out.print("Enter the name of you univeristy: ");
		String universityName = sc.nextLine();

		//User inputs age

		System.out.print("Enter your age: ");
		int studentAge = sc.nextInt();

		System.out.println("\n\nHere is your ID.");
		System.out.printf("******************************\n Name: %s\n University: %s\n Age: %d\n******************************\n",studentName, universityName, studentAge);

	}
}