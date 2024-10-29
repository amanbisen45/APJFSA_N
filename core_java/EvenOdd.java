package core_java;
import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {

		// Take Number From User
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// Check if the number is even or odd using a conditional operator
		String result = (num % 2 == 0) ? "Even" : "Odd";

		// Display the result
		System.out.println("The number is " + result );		

	}

}


/*  
Enter a Number :
7
The Number is odd
 */