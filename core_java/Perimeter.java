package core_java;

public class Perimeter {

	// Method to calculate the perimeter of a square
	public double result(double side) {
		return 4 * side;
	}

	// Method to calculate the perimeter of a rectangle
	public double result(double length, double width) {
		return 2 * (length + width);
	}

	// Method to calculate the perimeter of a circle
	public double result(double radius, boolean isCircle) {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		// Creating an object of the Perimeter class
		Perimeter obj = new Perimeter();

		// Calculating and displaying the perimeter of a square
		double squarePerimeter = obj.result(10.0);
		System.out.println("Perimeter of the square: " + squarePerimeter);

		// Calculating and displaying the perimeter of a rectangle
		double rectanglePerimeter = obj.result(10.0, 5.0);
		System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);

		// Calculating and displaying the perimeter of a circle
		double circlePerimeter = obj.result(8.0, true);
		System.out.println("Perimeter of the circle: " + circlePerimeter);
	}
}

/* Perimeter of the square: 40.0
Perimeter of the rectangle: 30.0
Perimeter of the circle: 50.26548245743669
*/
