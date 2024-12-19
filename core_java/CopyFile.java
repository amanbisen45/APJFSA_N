package core_java; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {

		// Define the file paths for source and destination files
		String sourceFile = "D:\\source.txt";
		String destinationFile = "D:\\destination.txt";

		// Try block to handle file operations
		try {

			// Create a FileReader object to read the source file
			FileReader fr = new FileReader(sourceFile);

			// Create a FileWriter object to write to the destination file
			FileWriter fw = new FileWriter(destinationFile);

			int character; // Variable to store each character read from the file

			// Loop to read characters from the source file until the end (-1)
			while ((character = fr.read()) != -1) {
				fw.write(character); // Write the character to the destination file
			}

			// Print success message after the file is copied
			System.out.println("File copied successfully.");
		} catch (IOException e) {
			// Handle any IO exceptions and print the error message
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}

//File copied successfully.