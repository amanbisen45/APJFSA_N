package core_java;
import java.util.Scanner;

public class TryCatchException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator value: "); //Taking input for a from user
		int a=sc.nextInt();
		System.out.println("Enter Denominator value: "); //Taking input for b from user
		int b=sc.nextInt();


		try {
			int division=a/b;  //Trying Division in try block
			System.out.println("Division is : "+ division); //Printing result
		} catch (ArithmeticException  e) {
			//Catch & Handle exception
			System.out.println("Error: Division By Zero is Not Allowed");
		}

	}

}
/*
Enter Numerator value: 
10
Enter Denominator value: 
0
Error: Division By Zero is Not Allowed
 */