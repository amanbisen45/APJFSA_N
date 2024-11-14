package core_java;

public class Autoboxing {

	public static void main(String[] args) {
		// Taking Integer
		int A=40;

		Integer A2=new Integer(A);   //Explicitly Wrapping Autoboxing

		Integer A3=A;   //implicitly wrapping autoboxing

		//printing values
		System.out.println(A2);
		System.out.println(A3);


	}

}

/*
40
40
*/