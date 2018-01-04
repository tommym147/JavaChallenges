// Thomas Mejia
// 1/3/2018
// Write a method that returns true if and only if an integer array
// contains duplicate items.
import java.util.Scanner;

public class DuplicateDetection {
	public static boolean detectDuplicate(int [] array, int size) {
		// check whole array for each index one by one
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] == array[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static int fillArray(int [] array) {
		Scanner input = new Scanner(System.in); // reads user input
		int x, counter = 0; // x holds user input and counter records array size
		
		// ask for user input
		System.out.println("Enter integers (input -999 to stop): ");
		x = input.nextInt();
		
		while (x != -999) { // will stop if user enters -999
			array[counter++] = x; // size increases as more integers are inputed
			x = input.nextInt();
		}
		return counter;
	}
	
	public static void main(String [] args) {
		int [] array = new int [50]; // array to hold integers
		int size; // keeps track of how many integers inputted into array
		
		size = fillArray(array); // fill array and record size
		
		// determine if there are duplicates
		if (detectDuplicate(array, size)) {
			System.out.println("There is a duplicate integer!");
		}
		else {
			System.out.println("No duplicate integers detected!");
		}
	}
}