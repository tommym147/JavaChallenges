// Thomas Mejia
// 12/30/2017
// Write a program that prints all perfect numbers less than 1000.
public class PerfectNumbers {
	public static void main(String [] args) {
		System.out.println("Perfect numbers from 1 to 1000: ");
		for (int i = 1; i < 1000; i++) { // check numbers from 1 to 1000
			int sum = 0; // holds sum of divisors
			for (int j = 1; j < i; j++) { // check all numbers before i to find divisors
				if (i % j == 0) { // if there's a divisor, add it to sum
					sum += j;
				}
			}
			if (sum == i) { // if sum of divisors is equal to number, print it out
				System.out.println(i);
			}
		}
	}
}