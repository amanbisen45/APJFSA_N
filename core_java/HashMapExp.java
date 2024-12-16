package core_java;

import java.util.Map;
import java.util.HashMap;

/**
 * This program demonstrates the usage of a HashMap in Java.
 * The HashMap stores keys as Integer and values as String.
 */
public class HashMapExp {

	public static void main(String[] args) {
		// Create a HashMap using the Map interface reference
		// The HashMap stores Integer keys and String values
		Map<Integer, String> hmap = new HashMap<>(); 

		// Add key-value pairs to the HashMap
		hmap.put(1, "Aman");   // Key: 1, Value: "Aman"
		hmap.put(2, "Ayush");  // Key: 2, Value: "Ayush"
		hmap.put(3, "Jitu");   // Key: 3, Value: "Jitu"
		hmap.put(4, "Dipak");  // Key: 4, Value: "Dipak"
		hmap.put(5, "Aniket"); // Key: 5, Value: "Aniket"

		// Print the HashMap's contents directly
		// Output will show all key-value pairs in random order
		System.out.println(hmap);
	}
}


/*
 {1=Aman, 2=Ayush, 3=Jitu, 4=Dipak, 5=Aniket}
 */