// Thomas Mejia 5/12/17
// Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class multiples {
	public static boolean checkMultiples(int theFirst, int theSecond) {
		// if no remainders when dividing, then it's a multiple
		if ((theSecond % theFirst) == 0) {
			return true;
		}
		return false;
	}

	public static void main (String [] args) {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(reader);		

		try {
			// ask for integers
			System.out.println("Enter first integer: ");
			int first = Integer.parseInt(console.readLine());

			System.out.println("Enter second integer: ");
			int second = Integer.parseInt(console.readLine());

			// check if multiples
			System.out.println(checkMultiples(first,second));
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
