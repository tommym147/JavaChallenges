// Thomas Mejia
// 1/1/2018
// Write a method that returns a random integer between x and y, inclusive.
import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {
	public static int randomInt(int x, int y) {
		Random rnd = new Random(); // generates random number
		if (x > y) { // check for min and max range to generate random number
			return (rnd.nextInt(x) + y); 
		}
		return (rnd.nextInt(y) + x); 
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // read user input
		int x, y; // holds values
		
		// ask for user input
		System.out.println("Enter two integers: ");
		x = input.nextInt();
		y = input.nextInt();
		
		// print value between inputs
		System.out.println("Random number generated: " + randomInt(x,y));
	}
}