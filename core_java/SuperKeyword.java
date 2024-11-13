package core_java;


class Parent {
	// Parameterized constructor of the Parent class
	Parent(int age) {
		System.out.println("Parent Age is " + age);
	}
}


class Child extends Parent {
	// Parameterized constructor of the Child class
	Child(int age) {
		// Calls the constructor of the Parent class with the parameter 'age'
		super(age);
		System.out.println("Child Age is " + age);
	}
}

// Main class to execute the code
public class SuperKeyword {
	public static void main(String[] args) {
		// Creating an object of the Child class and passing 22 as an argument
		Child obj1 = new Child(22);
	}
}

/*
Parent Age is 22
Child Age is 22
 */