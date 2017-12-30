// Thomas Mejia
// 12/30/2017
// Write a program that accepts an integer n and displays all the prime
// numbers from 2 and n.
import java.util.Scanner;

public class PrimeNumbers {
	public static boolean isPrime(int i) { // checks if a number is prime
		for (int j = 2; j < i; j++) {
			if (i % j == 0) { // if number is divisible by any other number before it, return false 
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // reads user input
		int x; // holds user input integer
		
		// ask for user input
		System.out.println("Please enter a positive integer greater than 2: ");
		x = input.nextInt();
		
		System.out.println("Prime numbers from 2 and " + x + " are: ");
		for (int i = 2; i <= x; i++) { // loop from 2 to x
			if (isPrime(i)) { // if there's a prime number, print it out
				System.out.println(i);
			}
		}
	}
}