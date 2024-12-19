package core_java; 

// Program to create a class DisplayMessage that implements the Runnable interface
public class DisplayMessage implements Runnable {

	// Overriding the run method of the Runnable interface
	public void run() {
		// The logic that will be executed when the thread starts
		System.out.println("Hello My Name is Aman");
	}

	public static void main(String[] Args) {
		// Create an instance of the DisplayMessage class
		DisplayMessage R1 = new DisplayMessage();

		// Create a new thread and pass the DisplayMessage instance (R1) as the target
		Thread t1 = new Thread(R1);

		// Start the thread, which internally calls the run method
		t1.start();
	}
}

// Output: 
// Hello My Name is Aman
