package core_java;

class Car {
	String model;  // Field to store the model of the car

	// Constructor to initialize the car's model
	Car(String model) {
		// 'this' keyword is used to refer to the current instance's model field
		this.model = model;
	}

	// Method to display the car's model
	void display() {
		System.out.println("My Car is: " + model);
	}
}

// Class representing a Mechanic that takes a Car object as an argument
class Mechanic {

	// Constructor that accepts a Car object and displays the model it is working on
	Mechanic(Car car) {
		// Accessing the 'model' field of the passed Car object
		System.out.println("Mechanic working on this Car: " + car.model);
	}
}


public class ThisKeyword {

	public static void main(String[] args) {
		// Creating a new Car object with model "Audi 718"
		Car obj1 = new Car("Audi 718");

		// Creating a Mechanic object and passing the Car instance (obj1) to it
		new Mechanic(obj1);

		// Displaying the model of the car using the display method in Car
		obj1.display();
	}
}

/*
Mechanic working on this Car :Audi 718
My Car is:Audi 718
 */
