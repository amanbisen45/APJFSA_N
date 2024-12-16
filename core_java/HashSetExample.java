package core_java;
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// Create a HashSet to store integers
		HashSet<Integer> set = new HashSet<>();

		// Add elements to the HashSet using add() method
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		// Display the HashSet before appending a new element
		System.out.println("HashSet before adding new element: " + set);

		// Append a specified element to the HashSet
		set.add(60);

		// Display the HashSet after appending the new element
		System.out.println("HashSet after adding new element: " + set);
	}

}

//Note:- Output Doesn't follow any order in HashSet
/*
HashSet before adding new element: [50, 20, 40, 10, 30]
HashSet after adding new element: [50, 20, 40, 10, 60, 30]
 */