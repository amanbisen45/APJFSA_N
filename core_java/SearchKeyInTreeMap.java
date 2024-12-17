package core_java;
import java.util.*;

public class SearchKeyInTreeMap {
	
	public static void main(String[] args) {
		// Create a TreeMap with name-age pairs
		TreeMap<String, Integer> nameAgeMap = new TreeMap<>();
		nameAgeMap.put("Aman", 23);
		nameAgeMap.put("Ayush", 21);
		nameAgeMap.put("Jitu", 22);
		nameAgeMap.put("Dipak", 24);
		nameAgeMap.put("Dharmendra", 28);

		// Create a scanner object for user input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a name to search for
		System.out.print("Enter a name to search for: ");
		String name = scanner.nextLine();

		// Search for the name in the TreeMap
		if (nameAgeMap.containsKey(name)) {
			// If the name exists, display the corresponding age
			System.out.println("Age of " + name + ": " + nameAgeMap.get(name));
		} else {
			// If the name doesn't exist, display a message
			System.out.println("Name not found in the TreeMap.");
		}

	}
}

/* Output 1: Enter a name to search for: Aman
             Age of Aman: 23
 */

/* Output 2: Enter a name to search for: Aniket
             Name not found in the TreeMap.
 */ 