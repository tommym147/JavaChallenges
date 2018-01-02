// Thomas Mejia
// 12/28/2017
// Write a program that accepts an integer n and prints the following right
// triangle with base and height n.
import java.util.Scanner;

public class Pictures {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in); // reads user input
		int triangle; // holds user input
		String x = ""; // string that creates triangle
		
		// Ask for user input
		System.out.println("Please enter an integer: ");
		triangle = input.nextInt();
		
		// Create triangle using a loop
		for (int i = 0; i < triangle; i++) {
			x = x + "X"; // concatenates X depending on row
			System.out.println(x); // print string
		}
	}
}