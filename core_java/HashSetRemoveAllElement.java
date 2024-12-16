package core_java; 

import java.util.*; 

public class HashSetRemoveAllElement {

	public static void main(String[] args) {
		// Create a HashSet of Integer type
		Set<Integer> hset = new HashSet<Integer>();

		// Adding elements to the HashSet
		hset.add(1);
		hset.add(2);
		hset.add(3);
		hset.add(4);
		hset.add(5);

		// Printing the HashSet before clearing
		System.out.println("HashSet Before :" + hset);

		// Clearing all elements in the HashSet
		hset.clear();

		// Printing the HashSet after clearing
		System.out.println("HashSet After :" + hset);
	}
}

/*
HashSet Before :[1, 2, 3, 4, 5]
HashSet After :[]
 */