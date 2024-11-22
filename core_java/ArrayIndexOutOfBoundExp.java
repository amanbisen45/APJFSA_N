package core_java;
import java.util.Scanner;

public class ArrayIndexOutOfBoundExp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		try {
			//declaring a array
			int arr[]= {1,2,3,4,5,6,7,8,9,10};

			//creating element index to get value at that index
			System.out.println("Enter the Index: ");
			int index=sc.nextInt();

			//Print value at Index
			System.out.println("The Element at Index is: "+arr[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			// catch & Handle Exception
			System.out.println("Invalid Index Position");
		}
		finally {
			// FInally Block always executes
			System.out.println("\nCode Executed Succesfully");
		}


	}

}

/*
Enter the Index: 
10
Invalid Index Position

Code Executed Succesfully
 */