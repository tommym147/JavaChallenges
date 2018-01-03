// Thomas Mejia
// 1/3/2017
// Write a program that prompts for 10 integers and displays those
// same numbers in reverse order.
import java.util.Scanner;

public class ReverseList {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // read user input
		int [] array = new int[10]; // array holds 10 integers
		
		// ask for user input
		System.out.println("Enter 10 integers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		// print with loop starting at end of array
		System.out.println("Integers in reverse: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}