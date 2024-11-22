package core_java;

public class SmallestInArray {

	public static void main(String[] args) {
		//Declare a array 
		int a[]= {23,24,56,34,11};

		//Take variable min initialize 1st element  of array as minimum value
		int min=a[0];

		//Using for loop to iterate through array
		for (int i = 1; i < a.length; i++) {

			//Use if condition to compare values
			if(min > a[i]) {
				//Update min if a[i] is smaller than max
				min=a[i];
			}
		}
		System.out.println("The Smallest Value in array is:"+min);


	}

}

//The Smallest Value in array is:11