package core_java;


public class Unboxing {

	public static void main(String[] args) {

		Integer A2 = new Integer(40);  // Explicitly Wrapping

		Integer A3 = 40;   // Implicitly Wrapping autoboxing


		int primitiveA2 = A2;  // Unboxing to primitive int
		int primitiveA3 = A3;  // Unboxing to primitive int

		// Printing values
		System.out.println(primitiveA2);
		System.out.println(primitiveA3);  
	}
}

/*
40
40
*/