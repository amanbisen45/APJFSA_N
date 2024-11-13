package core_java;
import java.math.*;

// Define the Shape interface with the getArea method
interface Shape {
	void getArea(); // Method to calculate area, must be implemented by each shape
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
	// Implement the getArea method for Rectangle
	public void getArea() {
		int length = 10;    // Define the length of the rectangle
		int breadth = 20;   // Define the breadth of the rectangle
		System.out.println("Area Of Rectangle is: " + (length * breadth)); // Calculate and print area
	}
}

// Circle class implementing Shape interface
class Circle implements Shape {
	// Implement the getArea method for Circle
	public void getArea() {
		double radius = 10;    // Define the radius of the circle
		System.out.println("Area Of Circle is: " + (Math.PI * radius * radius)); // Calculate and print area
	}
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
	// Implement the getArea method for Triangle
	public void getArea() {
		int base = 10;      // Define the base of the triangle
		int height = 10;    // Define the height of the triangle
		int area = (base * height) / 2; // Calculate the area of the triangle
		System.out.println("Area Of Triangle is: " + area); // Print the area of the triangle
	}
}


public class GetArea {
	public static void main(String[] args) {
		// Create an instance of Rectangle
		Rectangle rectangle = new Rectangle();
		// Create an instance of Circle
		Circle circle = new Circle();
		// Create an instance of Triangle
		Triangle triangle = new Triangle();

		// Call the getArea method on each shape to print their areas
		rectangle.getArea(); // Prints area of the rectangle
		circle.getArea();    // Prints area of the circle
		triangle.getArea();  // Prints area of the triangle
	}
}

/*
Area Of Rectangle is: 200
Area Of Circle is: 314.1592653589793
Area Of Triangle is: 50
 */