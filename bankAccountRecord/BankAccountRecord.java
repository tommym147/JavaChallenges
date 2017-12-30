// Thomas Mejia
// 12/29/2017
// Write a program that reads a list of numbers representing deposits
// to and withdrawals from a savings account.
import java.util.Scanner;

public class BankAccountRecord {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int x, sumOfWithdrawals = 0, sumOfDeposits = 0;
		
		System.out.println("Welcome to your bank account!");
		System.out.println("Please enter positive integers for withdrawals, negative integers for deposits, or zero to exit.");
		x = input.nextInt();
		
		while (x != 0) {
			if (x > 0) {
				sumOfWithdrawals += x;
			}
			else {
				sumOfDeposits += x;
			}
			x = input.nextInt();
		}
		
		System.out.println("Sum of withdrawals: " + sumOfWithdrawals);
		System.out.println("Sum of deposits: " + sumOfDeposits);
	}
}