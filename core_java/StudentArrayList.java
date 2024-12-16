package core_java;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class demonstrates the usage of a Collection interface and ArrayList
 * to store and iterate over a list of student names.
 */
public class StudentArrayList {

	public static void main(String[] args) {
		// Create a Collection of Strings to store student names
		Collection<String> student = new ArrayList<String>();

		// Add student names to the collection
		student.add("Aman");
		student.add("Ayush");
		student.add("Jitu");
		student.add("Dipak");
		student.add("Azad");
		student.add("Ashish");
		student.add("Shyam");
		student.add("Prachit");
		student.add("Aniket");
		student.add("Aniruddha");

		// Iterate through the collection and print each student name
		for (String name : student) {
			System.out.println(name);
		}
	}
}
/*
Aman
Ayush
Jitu
Dipak
Azad
Ashish
Shyam
Prachit
Aniket
Aniruddha
 */
