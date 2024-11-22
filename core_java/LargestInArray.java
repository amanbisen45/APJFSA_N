package core_java;

public class LargestInArray {

	public static void main(String[] args) {
		//Declare a array 
		int a[]= {23,24,56,34,11};

		//Take variable max initialize 1st element  of array as maximum value
		int max=a[0];

		//Using for loop to iterate through array
		for (int i = 1; i < a.length; i++) {

			//Use if condition to compare values
			if(max < a[i]) {
				//Update max if a[i] is greater than max
				max=a[i];
			}
		}
		System.out.println("The Largest Value in array is:"+max);


	}

}

//The Largest Value in array is:56