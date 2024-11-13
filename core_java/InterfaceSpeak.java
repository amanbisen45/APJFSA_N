package core_java;

// Define the Person interface with the speak method
interface Person {
	void speak(); // Method that must be implemented by any class that implements Person
}

// Student class implements the Person interface
class Student implements Person {

	// Implement the speak method for Student
	public void speak() {
		System.out.println("Student is speaking"); // Output when student speaks
	}
}

// Teacher class implements the Person interface
class Teacher implements Person {

	// Implement the speak method for Teacher
	public void speak() {
		System.out.println("Teacher is speaking"); // Output when teacher speaks
	}
}


public class InterfaceSpeak {

	public static void main(String[] args) {
		// Create an instance of Student
		Student student = new Student();

		// Create an instance of Teacher
		Teacher teacher = new Teacher();

		// Call the speak method on the student object
		student.speak();

		// Call the speak method on the teacher object
		teacher.speak();
	}
}

/*
I am a student.
I am a teacher.
 */
