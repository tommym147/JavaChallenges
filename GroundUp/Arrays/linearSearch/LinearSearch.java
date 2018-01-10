// Thomas Mejia
// 1/9/2018
// Write a program that uses linear search to see if an integer is in an array
import java.util.Scanner;

public class LinearSearch {
	public static boolean linearSearch (int [] array, int value) {
		for (int i = 0; i < array.length; i++) { // iterate through whole array
			if (value == array[i]) { // if there's a match, return true
				return true;
			}
		}
		return false;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // reads user input
		int [] array = {4, 3, 5, 2, 1, 9, 45, 88, 33}; // array that holds integer values
		int value; // variable to hold user input
		
		// ask for user input
		System.out.println("Enter integer you want to search for: ");
		value = input.nextInt();
		
		// print whether integer was found
		if (linearSearch(array, value)) {
			System.out.println("The integer is in the array.");
		}
		else {
			System.out.println("The integer is not in the array.");
		}
	}
}