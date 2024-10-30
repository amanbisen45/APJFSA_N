package core_java;

public class Pattern1 {

	public static void main(String[] args) {
		// Initialize the number of rows for the pattern
		int n = 5;

		// Outer loop for each row
		for (int i = 1; i <= n; i++) {
			// Inner loop for printing numbers in each row
			for (int j = 1; j <= i; j++) {
				// Print the current number in the sequence
				System.out.print(j);
			}
			// Move to the next line after completing each row
			System.out.println();
		}
	}
}

/*
1
12
123
1234
12345
 */