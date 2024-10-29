package core_java;
import java.util.*;

public class Swapping1 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a :");
		int a = sc.nextInt();
		System.out.println("Enter Value of b :");
		int b = sc.nextInt();

		// Using a third variable
		int temp = a; // store the value of 'a' in 'temp'
		a = b;        // assign the value of 'b' to 'a'
		b = temp;     // assign the value of 'temp' (original 'a') to 'b'

		// Output the result
		System.out.println("Numbers After swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

/*Enter Value of a :
10
Enter Value of b :
20
Value of a :10
Value of b :20
Numbers After swapping:
a = 20
b = 10
 */
