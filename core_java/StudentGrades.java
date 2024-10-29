package core_java;

public class StudentGrades {

	public static void main(String[] args) {

		int score = 85; // Change this value to test different score

		// Declare a variable to hold the grade
		char grade;

		// Determine the grade based on the score
		if (score >= 90 && score <= 100) {
			grade = 'A';  // Score range for grade A
		} else if (score >= 80) {
			grade = 'B';  // Score range for grade B
		} else if (score >= 70) {
			grade = 'C';  // Score range for grade C
		} else if (score >= 60) {
			grade = 'D';  // Score range for grade D
		} else if (score >= 0) {
			grade = 'F';  // Score range for grade F
		} else {
			// Print an error message for invalid score
			System.out.println("Invalid score. Please enter a score between 0 and 100.");
			return; // Exit the program
		}

		// Output the grade to the user
		System.out.println("The student's grade is: " + grade);
	}
}

// The student's grade is: B
