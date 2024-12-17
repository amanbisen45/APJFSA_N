package core_java;
import java.util.*;

// Write a java program to implement comparable interface that sorts the Age of Employee Id,Name,Age.

class EmployeeDetails implements Comparable<EmployeeDetails>{
	int id;
	String name;
	int age;
	public EmployeeDetails(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// Override the compareTo method to define sorting logic based on age
	public int compareTo(EmployeeDetails O) {
		// Compare the age of current object with another Employee object
		if (this.age > O.age) {
			return 1; // Current object is greater (should come later in sorted order)
		} else {
			return -1; // Current object is smaller (should come earlier in sorted order)
		}
	}
}

// Main class to demonstrate the Comparable interface implementation
public class ComparableInterface {

	public static void main(String[] args) {

		// Create a list of Employee objects
		List<EmployeeDetails> emp = new ArrayList<>();
		emp.add(new EmployeeDetails(1, "Aman", 23));
		emp.add(new EmployeeDetails(2, "Ayush", 21));
		emp.add(new EmployeeDetails(3, "Dipak", 22));
		emp.add(new EmployeeDetails(4, "Jitu", 26));

		// Sort the list of Employee objects using Collections.sort()
		Collections.sort(emp);

		// Print the sorted Employee list
		for (EmployeeDetails Emp : emp) {
			System.out.println(Emp.getId() + " " + Emp.getName() + "  " + Emp.getAge());
		}
	}
}

/*
2 Ayush  21
3 Dipak  22
1 Aman  23
4 Jitu  26
*/