package core_java; 

// Program to print numbers from 1 to 10 with a delay of 500 milliseconds using threads
public class SleepMethodExample extends Thread {

	// Overriding the run method of the Thread class
	public void run() {
		// Loop to print numbers from 1 to 10
		for (int i = 1; i <= 10; i++) {
			try {
				// Makes the current thread sleep for 500 milliseconds (0.5 seconds)
				Thread.sleep(500); 

				// Prints the current number
				System.out.println(i);
			} catch (Exception e) {
				// Prints any exception message if an error occurs
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		// Create an instance of SleepMethodExample
		SleepMethodExample t1 = new SleepMethodExample();

		// Start the thread execution by calling the start() method
		t1.start();
	}
}

/*
Expected Output:
1
2
3
4
5
6
7
8
9
10

Note: Each number will be printed with a 500-millisecond delay.
 */
