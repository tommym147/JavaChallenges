// Thomas Mejia
// 12/30/2017
// Write a program that accepts an integer n and displays all the prime
// numbers from 2 and n.
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int x;
		boolean isPrime = true;
		
		System.out.println("Please enter a positive integer greater than 2: ");
		x = input.nextInt();
		
		System.out.println("Prime numbers from 2 and " + x + " are: ");
		for (int i = 2; i <= x; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
			else {
				isPrime = true;
			}
		}
	}
}