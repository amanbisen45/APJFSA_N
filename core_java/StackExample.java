package core_java;
import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		// Create a stack to store integers
		Stack<Integer> stack = new Stack<>();

		// Push 10 elements onto the stack
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}

		// Display the stack after adding elements
		System.out.println("Stack after adding 10 elements: " + stack);

		// Remove 4 elements from the stack
		for (int i = 0; i < 4; i++) {
			if (stack.isEmpty()) {
				System.out.println("Stack is Empty");
			}else {
				stack.pop();
			}
		}

		// Display the stack after removing 4 elements
		System.out.println("Stack after removing 4 elements: " + stack);
	}



}
/*
Stack after adding 10 elements: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Stack after removing 4 elements: [1, 2, 3, 4, 5, 6]
*/
