package core_java;
import java.util.*;

public class UnionOfTwoSet {

	public static void main(String[] args) {

		// Create the first HashSet
		Set<Integer> set1=new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(7);

		System.out.println("Set 1: "+set1);

		//Create the first HashSet
		Set<Integer> set2=new HashSet<>();
		set2.add(1);
		set2.add(3);
		set2.add(4);
		set2.add(9);
		set2.add(8);

		System.out.println("Set 2: "+set2);

		// Perform union of set1 and set2
		Set<Integer> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);

		// Display the union of both sets
		System.out.println("Union of Set 1 and Set 2: " + unionSet);
	}

}

/*
 Set 1: [1, 2, 4, 6, 7]
Set 2: [1, 3, 4, 8, 9]
Union of Set 1 and Set 2: [1, 2, 3, 4, 6, 7, 8, 9]
 */
