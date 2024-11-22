package core_java;
import java.util.Scanner;

public class FinallyBlockExp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Numerator Value: ");//get numerator value
		int a=sc.nextInt();

		System.out.println("Enter Denomenator Value: ");//get denomenator value
		int b=sc.nextInt();

		try {
			//Attempting Division
			int division=a/b;
			System.out.println("The Division is: "+division);//Printing result

		} catch (ArithmeticException e) {
			//Catch & handle ArithmeticException
			System.out.println("Error: Division By Zero Is Not Allowed");
		}
		finally {
			// This block always executes, regardless of whether an exception occurred
			System.out.println("\nCode executed succesfully");
		}

	}

}



/*
 Enter Numerator Value: 
10
Enter Denomenator Value: 
0
Error: Division By Zero Is Not Allowed

Code executed succesfully

 */
