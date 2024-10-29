package core_java;
import java.util.Scanner;

public class Swapping2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking input from the user
		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		int b = sc.nextInt();

		// Swapping without a third variable
		a = a + b; // Step 1: a now holds the sum of a and b
		b = a - b; // Step 2: b now holds the original value of a
		a = a - b; // Step 3: a now holds the original value of b

		// Output the result
		System.out.println("Numbers After swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}

/*
Enter the value of a: 10
Enter the value of b: 20
Numbers After swapping:
a = 20
b = 10
 */