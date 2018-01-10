// Thomas Mejia
// 1/9/2018
// Write a program that uses linear search to see if an integer is in an array
import java.util.Scanner;

public class LinearSearch {
	public static boolean linearSearch (int [] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int [] array = {4, 3, 5, 2, 1, 9, 45, 88, 33};
		int value;
		
		System.out.println("Enter integer you want to search for: ");
		value = input.nextInt();
		
		if (linearSearch(array, value)) {
			System.out.println("The integer is in the array.");
		}
		else {
			System.out.println("The integer is not in the array.");
		}
	}
}