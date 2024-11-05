package stringBuffer;

import java.util.Scanner;

public class Ex5 {
	// Java program to read some values using Scanner
	// class and print their mean.

	public static void main(String[] args) {
		// Declare an object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");

		// Initialize sum and count of input elements
		int sum = 0, count = 0;

		// Check if an int value is available
		while (sc.hasNextInt()) {
			// Read an int value
			int num = sc.nextInt();
			sum += num;
			count++;
		}
		if (count > 0) {
			int mean = sum / count;
			System.out.println("Mean: " + mean);
		} else {
			System.out.println("No integers were input. Mean cannot be calculated.");
		}
	}

}
