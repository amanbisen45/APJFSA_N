package core_java;

public class ArrayIndexOutOfBoundsExample {

	public static void main(String[] args) {
		// Define an array with 6 elements
		int[] numbers = {10, 20, 30, 40, 50, 60};

		System.out.println("Array elements:");

		// Loop through the array to access an out-of-bounds index
		for (int i = 0; i <= numbers.length; i++) {
			try {
				// Access the element at index i
				System.out.println("Element at index " + i + ": " + numbers[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// Handle the exception and print an error message
				System.out.println("Exception: Index " + i + " but it is out of bounds.");
			}
		}

	}

}

/*
Array elements:
Element at index 0: 10
Element at index 1: 20
Element at index 2: 30
Element at index 3: 40
Element at index 4: 50
Element at index 5: 60
Exception: Index 6 but it is out of bounds.
*/