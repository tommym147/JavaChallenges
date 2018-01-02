// Thomas Mejia
// 12/29/2017
// Write a program that reads a list of numbers representing deposits
// to and withdrawals from a savings account.
import java.util.Scanner;

public class BankAccountRecord {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in); // reads user input
		int x, sumOfWithdrawals = 0, sumOfDeposits = 0; // x holds input, other variables hold sum of withdrawals and deposits
		
		// ask for user input
		System.out.println("Welcome to your bank account!");
		System.out.println("Please enter positive integers for withdrawals, negative integers for deposits, or zero to exit.");
		x = input.nextInt();
		
		// record all inputs while input is not 0
		while (x != 0) {
			if (x > 0) {
				sumOfWithdrawals += x; // add to sumOfWithdrawals if input is positive
			}
			else {
				sumOfDeposits += x; // add to sumOfDeposits if input is negative
			}
			x = input.nextInt(); // keep asking for input until user enters 0
		}
		
		// print sums
		System.out.println("Sum of withdrawals: " + sumOfWithdrawals);
		System.out.println("Sum of deposits: " + sumOfDeposits);
	}
}