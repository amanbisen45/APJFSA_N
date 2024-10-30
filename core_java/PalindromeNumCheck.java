package core_java;

import java.util.Scanner;

public class PalindromeNumCheck {

	// Method to reverse a number
	public static int reverseNumber(int num) {
		int reversed = 0;

		while (num != 0) {
			int digit = num % 10;            // Get the last digit
			reversed = reversed * 10 + digit; // Build the reversed number
			num /= 10;                        // Remove the last digit
		}

		return reversed; // Return the reversed number
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		// Reverse the number
		int reversedNumber = reverseNumber(number);

		// Check if the reversed number is the same as the original number
		if (reversedNumber == number) {
			System.out.println(number + " is a palindrome number.");
		} else {
			System.out.println(number + " is not a palindrome number.");
		}

	}
}

/*
Enter a number: 1551
1551 is a palindrome number.
 */