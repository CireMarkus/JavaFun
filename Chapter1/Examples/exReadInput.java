import java.io.IOException; //line 1

public class exReadInput{ // line 2
	public static void main(String[] args) throws IOException{// line 3
		System.out.println("Enter your first byte");
		int inByte = System.in.read();// line 5
		System.out.println("The first byte that you typed: " + (char) inByte); //line 6
		System.out.printf("%s: %c. %n", "The first byte that you typed", inByte);//line 7 

	}
}