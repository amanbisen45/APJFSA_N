package core_java;


public class AllDatatypes {

	public static void main(String[] args) {
		// Primitive data types

		// 1. Integer types
		byte byteValue = 100;             // 8-bit signed integer
		short shortValue = 10000;         // 16-bit signed integer
		int intValue = 100000;            // 32-bit signed integer
		long longValue = 100000L;         // 64-bit signed integer (suffix 'L' indicates long)

		// 2. Floating-point types
		float floatValue = 8.5f;         // 32-bit floating-point (suffix 'f' indicates float)
		double doubleValue = 27.99;       // 64-bit floating-point

		// 3. Character type
		char charValue = 'A';             // 16-bit Unicode character

		// 4. Boolean types
		boolean booleanValueTrue = true;  // Boolean true value
		boolean booleanValueFalse = false; // Boolean false value

		// Output all variable values to the console
		System.out.println("Byte Value: " + byteValue);               // Prints the byte value
		System.out.println("Short Value: " + shortValue);             // Prints the short value
		System.out.println("Int Value: " + intValue);                 // Prints the int value
		System.out.println("Long Value: " + longValue);               // Prints the long value
		System.out.println("Float Value: " + floatValue);             // Prints the float value
		System.out.println("Double Value: " + doubleValue);           // Prints the double value
		System.out.println("Char Value: " + charValue);               // Prints the char value
		System.out.println("Boolean True Value: " + booleanValueTrue); // Prints the true boolean value
		System.out.println("Boolean False Value: " + booleanValueFalse); // Prints the false boolean value
	}

}

/* 
 * Byte Value: 100
Short Value: 10000
Int Value: 100000
Long Value: 100000
Float Value: 8.5
Double Value: 27.99
Char Value: A
Boolean True Value: true
Boolean False Value: false
*/
