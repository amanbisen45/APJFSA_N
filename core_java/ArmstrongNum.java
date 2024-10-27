package core_java;
import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number to check if it is an Armstrong number: ");
		int number = scanner.nextInt();

		// Initialize variables
		int originalNumber = number;  // Store the original number for comparison later
		int remainder;                // To store each digit of the number
		int result = 0;               // To store the sum of cubes of digits

		// Loop to calculate the sum of the cubes of each digit
		while (originalNumber != 0) {
			// Extract the last digit of originalNumber
			remainder = originalNumber % 10;
			// Add the cube of the digit to the result
			result += Math.pow(remainder, 3);
			// Remove the last digit from originalNumber
			originalNumber /= 10;
		}

		// Check if the calculated result matches the original number
		if (result == number) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}
}


/* Enter a number to check if it is an Armstrong number:  153
  153 is an Armstrong number.
 */

