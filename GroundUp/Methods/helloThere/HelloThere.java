// Thomas Mejia
// 1/2/2018
// Write a program that prompts a user for a positive integer n and 
// prints "Hello There" n times.
import java.util.Scanner;

public class HelloThere {
	public static void printHello(int n) { // // function that prints "Hello There!" n times
		for (int i = 0; i < n; i++) {
			System.out.println("Hello There!");
		}
	}
	
	public static int getPos() { // function that returns positive value
		Scanner input = new Scanner(System.in); // reads user input
		int pos; // records user input
		
		// ask for user input
		System.out.println("Please enter positive integer: ");
		pos = input.nextInt();
		
		// make sure user enters positive integer
		while (pos <= 0) {
			System.out.println("Invalid input. Please enter positive integer: ");
			pos = input.nextInt();
		}
		
		return pos;
	}
	
	public static void main(String [] args) {
		int n; // number of times to print "Hello There!"
		
		n = getPos(); // ask for user input
		
		printHello(n); // print loop of "Hello There!"
	}
}