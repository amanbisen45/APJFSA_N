package core_java;
import java.util.*;

public class SumOfEvenNumbersArrayList {

	public static void main(String[] args) {
		// Create an ArrayList to store integers
		List<Integer> nums = new ArrayList<>();

		// Add integers from 1 to 10 to the ArrayList
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);

		// Variable to store the sum of even numbers
		int addition = 0;

		// Iterate through each number in the ArrayList
		for (Integer n : nums) {
			// Check if the number is even
			if (n % 2 == 0) {
				// Add the even number to the sum
				addition += n;
			}
		}

		// Print the sum of all even numbers in the ArrayList
		System.out.println("Sum of All Even Numbers Present in ArrayList is: " + addition);
	}
}

//Sum of All Even Numbers Present in ArrayList is:  30